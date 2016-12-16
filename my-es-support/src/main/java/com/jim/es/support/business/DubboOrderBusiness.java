package com.jim.es.support.business;

import com.jim.es.support.bean.OrderInfo;

import java.util.List;

/**
 * @author Jim
 * @date 12/16/2016
 * @version 1.0
 * @description
 */
public interface DubboOrderBusiness {

    List<OrderInfo> findAllOrders(String name);
}
