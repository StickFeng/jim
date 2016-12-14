
package com.jim.es.core.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.client.RestTemplate;

/**
 * @author Jim
 * @version 1.0
 * @date 12/12/2016
 * @description
 */
@Configuration
@EnableScheduling
@EnableAspectJAutoProxy
@ComponentScan(basePackages = {"com.jim.es.core"},excludeFilters = @ComponentScan.Filter(pattern = "com.jim.es.core.controller", type = FilterType.REGEX))
@PropertySource(value = {"classpath:/es-core.properties"})

public class WebAppConfig {
    @Value("${app.env}")
    private String env;

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
