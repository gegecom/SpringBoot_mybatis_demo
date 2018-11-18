package com.example.demo.controller;

import com.example.demo.pojo.UserInfoPO;
import com.example.demo.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/userInfo")
public class UserInfoController {

    @Autowired
    UserInfoService userInfoService;

//    @RequestMapping(value="/add",method=RequestMethod.POST,produces="application/json;charset=UTF-8")
//    @ResponseBody
    @PostMapping("/addUser")
    public String addUserInfoCon(UserInfoPO userInfo){
        return userInfoService.addUserInfo(userInfo) > 0? "success":"fail";
    }

    @PostMapping("/addUsertemp")
    public String addUserInfoCons(@RequestParam(value="userInfo")UserInfoPO userInfo){
        return userInfoService.addUserInfo(userInfo) > 0? "success":"fail";
    }

    @PostMapping("/getDemo")
    public String conDemo(@RequestParam(value="demo")String demo){
        return demo;
    }

}
