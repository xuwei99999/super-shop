package com.edu.mapper;

import com.edu.pojo.UserPojo;

public interface UserMapper {
    //根据用户名查询用户
    public UserPojo queryUserByUname(String uname);

    public int insertUser(UserPojo userPojo);
}
