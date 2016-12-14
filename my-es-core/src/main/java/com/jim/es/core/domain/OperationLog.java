package com.jim.es.core.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Jim
 * @date 11/25/2016
 * @version 1.0
 * @description
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OperationLog implements Serializable{

    private static final long serialVersionUID = 8116353937287905224L;
    private Integer id;
    private int type;
    private String name;
    private String content;
    private String timestamp;
    private Date create_time;
}
