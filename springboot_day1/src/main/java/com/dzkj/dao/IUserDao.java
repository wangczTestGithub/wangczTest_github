package com.dzkj.dao;

import com.dzkj.entity.User;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

public interface IUserDao {
    // 登录
    @Select("select * from t_user where u_name=#{uname} and u_pwd=#{upwd}")
    @ResultMap("userMapper")
    public User login(User user);
}
