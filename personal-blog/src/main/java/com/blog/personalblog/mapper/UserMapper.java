package com.blog.personalblog.mapper;

import com.blog.personalblog.pojo.Users;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
@Mapper
public interface UserMapper {

    List<Users> selAll();
    List<Users> selById(Integer user_id);
    List<Users> selByAccountName(String user_accountName);

    Integer update(Users users);

    Integer del(Users users);

    Integer insert(Users users);

}
