package com.dzkj.service.impl;

import com.dzkj.dao.IUserDao;
import com.dzkj.entity.User;
import com.dzkj.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {
    @Autowired
    private IUserDao userDao;

    public User login(User user) {
        return userDao.login(user);
    }
}
