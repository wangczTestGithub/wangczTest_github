package com.dzkj.dao;

import com.dzkj.entity.User;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IStudentDao {

    // 查询所有
    @Select("select * from t_student")
    @ResultMap("studentMapper")
    public List queryAll();
}
