package com.blog.personalblog.service;


import com.blog.personalblog.pojo.Users;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    List<Users> selAll();
    List<Users> selById(Integer user_id);
    List<Users> selByAccountName(String user_accountName);

    Integer update(Users users);

    Integer del(Users users);

    Integer insert(Users users);

}
