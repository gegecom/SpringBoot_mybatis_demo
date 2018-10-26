package com.example.demo.controller;

import com.example.demo.pojo.TUser;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("mybatis")
public class TUserController {

    @Autowired
    UserService userService;

    @RequestMapping("/saveUser")
    public String savuUser() throws Exception{
        TUser user = new TUser();
        user.setUsername("gesy");
        user.setPassword("123456");
        user.setPhone("12345678900");
        userService.saveUser(user);
        return "保存成功";
    }
//
//    public UserService getUserService() {
//        return userService;
//    }
//
//    public void setUserService(UserService userService) {
//        this.userService = userService;
//    }
}
