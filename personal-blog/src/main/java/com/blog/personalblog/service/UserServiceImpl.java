package com.blog.personalblog.service;

import com.blog.personalblog.mapper.UserMapper;
import com.blog.personalblog.pojo.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<Users> selAll() {
        return userMapper.selAll();
    }

    @Override
    public List<Users> selById(Integer user_id) {
        return userMapper.selById(user_id);
    }

    @Override
    public List<Users> selByAccountName(String user_accountName) {
        return userMapper.selByAccountName(user_accountName);
    }

    @Override
    public Integer update(Users users) {
        return userMapper.update(users);
    }

    @Override
    public Integer del(Users users) {
        return userMapper.del(users);
    }

    @Override
    public Integer insert(Users users) {
        return userMapper.insert(users);
    }
}
