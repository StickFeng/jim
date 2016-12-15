package com.jim.es.core.mapper;

import com.jim.es.core.domain.user.UserInfo;
import com.jim.es.core.dto.UserDto;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Jim
 * @date 11/25/2016
 * @version 1.0
 */
@Repository
public interface UserMapper {

    @Select({"<script>",
            "select user.* from USER user WHERE 1=1 ",
            "<if test=\"param.name != null and !''.equals(param.name)\">and user.username = #{param.name}</if>",
            "<if test=\"param.password != null and !''.equals(param.password)\"> and user.password = #{param.password}</if>",
            "</script>"})
    @ResultType(UserInfo.class)
    List<UserInfo> getUserInfo(@Param("param")UserDto userDto);

    @Insert("INSERT INTO USER(no,username,password,mobile,email,first_login_time,login_time,create_time,delete_flag)\n" +
            "VALUES(#{param.no},#{param.name},#{param.password},#{param.mobile},#{param.email},#{param.first_login_time},#{param.login_time},#{param.create_time},#{param.delete_flag})")
    void addUser(@Param("param") UserDto userDto);

    @Select("select * from user where username = #{param.name}")
    @ResultType(UserInfo.class)
    UserInfo getSingleUserInfo(@Param("param") UserDto userDto);
}
