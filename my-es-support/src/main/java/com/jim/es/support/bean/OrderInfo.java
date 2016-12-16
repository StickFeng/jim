package com.jim.es.support.bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author Jim
 * @date 12/16/2016
 * @version 1.0
 * @description
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderInfo implements Serializable{
    private static final long serialVersionUID = -755508555075432375L;

    private String orderId;
    private String name;
    private String mobile;
    private String address;
    private Integer status;
}
