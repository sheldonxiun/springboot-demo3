package io.xiun.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    @Insert("insert into t_user (username,password) values(#{username},#{password})")
    public void save(@Param("username") String username, @Param("password") String password);

}
