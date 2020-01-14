package com.blog.personalblog.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Users {

    private Integer user_id;
    private String user_accountName;
    private String user_password;
    private String user_userName;
    private String user_email;
    private String user_image;
    private String create_time;
    private Date update_time;
    private Date state;
}
