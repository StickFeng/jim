package com.jim.es.core.business;

import com.jim.es.core.common.interceptor.Business;
import com.jim.es.support.bean.OrderInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jim
 * @date 12/19/2016
 * @version 1.0
 */
@Business("orderBuesiness")
public class OrderBusinessImpl implements OrderBusiness{

    private static final Logger LOGGER = LoggerFactory.getLogger(OrderBusinessImpl.class);

    @Override
    public List<OrderInfo> findAllOrders(String name) {
        List<OrderInfo> orderInfoList = new ArrayList<>();
        OrderInfo orderInfo = new OrderInfo();
        orderInfo.setName("Jon");
        orderInfo.setMobile("18326936750");
        orderInfoList.add(orderInfo);
        return orderInfoList;
    }
}
