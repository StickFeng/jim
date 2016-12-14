package com.jim.es.core.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Jim
 * @version 1.0
 * @date 12/12/2016
 * @description
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDto implements Serializable{

    private static final long serialVersionUID = -3020771467127723464L;
    private String no;
    private String name;
    private String password;
    private String mobile;
    private String email;
    private Date first_login_time;
    private Date login_time;
    private Date create_time;
    private String delete_flag;
}
