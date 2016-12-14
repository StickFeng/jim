package com.jim.es.core.domain.user;

import lombok.*;

import java.io.Serializable;

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
public class UserInfo implements Serializable{
    private static final long serialVersionUID = 4600211458103653979L;

    private String no;
    private String name;
    private String password;
    private String mobile;
    private String address;
}
