
package com.jim.es.core.app;

import com.jim.es.core.common.filter.EsSessionFilter;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.util.IntrospectorCleanupListener;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

/**
 * @author Jim
 * @version 1.0
 * @date 12/12/2016
 * @description
 */
public class WebAppInitializer implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext container) {
        // Create the 'root' Spring application context
        AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
        rootContext.register(WebAppConfig.class); // AppDataConfig.class

        // Classloader回收防止内存泄露，必须第一个
        container.addListener(new IntrospectorCleanupListener());
        // Manage the lifecycle of the root application context
        container.addListener(new ContextLoaderListener(rootContext));

        // Create the dispatcher servlet's Spring application context
        AnnotationConfigWebApplicationContext dispatcherServlet = new AnnotationConfigWebApplicationContext();
        dispatcherServlet.register(WebMvcConfig.class);

        // Register and map the dispatcher servlet
        ServletRegistration.Dynamic dispatcher = container.addServlet("es", new DispatcherServlet(dispatcherServlet));
        dispatcher.setLoadOnStartup(1);
        dispatcher.setAsyncSupported(true);
        dispatcher.addMapping("/api/*");
        registerFilter(container);
    }

    private void registerFilter(ServletContext context) {
        CharacterEncodingFilter cef = new CharacterEncodingFilter();
        cef.setForceEncoding(true);
        cef.setEncoding("UTF-8");
        context.addFilter("encodingFilter", cef).addMappingForUrlPatterns(null ,true, "/*");
        context.addFilter("esSessionFilter", EsSessionFilter.class).addMappingForUrlPatterns(null,true,"/*");
    }

}
