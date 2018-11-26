package com.dzkj.service.impl;

import com.dzkj.dao.IStudentDao;
import com.dzkj.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements IStudentService {

    @Autowired
    private IStudentDao studentDao;

    public List queryAll() {
        return studentDao.queryAll();
    }
}
