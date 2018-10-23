package com.example.demo.controller;

import com.example.demo.pojo.Resource;
import com.example.demo.pojo.User;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class HelloController {

    @Autowired
    private Resource resource;

    @RequestMapping("/hello")
    public User hello(){
        User u = new User();
        u.setName("geshiying");
        u.setAge(18);
        u.setBirthday(new Date());
        u.setPassword("123456");
        u.setDesc("engineer");
        return  u;
    }

    @RequestMapping("/getResource")
    public Object getResource(){
        Resource bean = new Resource();
        BeanUtils.copyProperties(resource,bean);
        return bean;
    }


}

