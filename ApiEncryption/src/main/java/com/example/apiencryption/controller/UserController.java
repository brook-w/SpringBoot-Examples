package com.example.apiencryption.controller;

import com.alibaba.fastjson2.JSON;
import com.example.apiencryption.config.secret.ResponseBasic;
import com.example.apiencryption.model.User;
import com.example.apiencryption.model.UserType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;



@Slf4j
@RestController
@RequestMapping(value = {"/user", "/secret/user"})
public class UserController {
    @GetMapping("/list")
    ResponseBasic<List<User>> listUser() {
        log.info("UserController");
        List<User> users = new ArrayList<>();
        User u = new User();
        u.setId(1);
        u.setName("boyka");
        u.setRegisterTime(LocalDateTime.now());
        u.setUserType(UserType.COMMON);
        users.add(u);
        ResponseBasic<List<User>> response = new ResponseBasic<>();
        response.setCode(200);
        response.setData(users);
        response.setMsg("用户列表查询成功");
        return response;
    }

    @RequestMapping("/save")
    ResponseBasic<Boolean> saveUser(@RequestBody User user) {
        // ... 新建用户
        log.info("save user ok: {}", JSON.toJSON(user));
        ResponseBasic<Boolean> response = new ResponseBasic<>();
        response.setCode(200);
        response.setData(Boolean.TRUE);
        response.setMsg("用户创建成功");
        return response;
    }
}