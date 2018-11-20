package com.example.demo.controller;

import com.example.demo.pojo.UserInfoPO;
import com.example.demo.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/userInfo")
//@Api(value = "用户信息")
public class UserInfoController {

    @Autowired
    UserInfoService userInfoService;

//    @RequestMapping(value="/add",method=RequestMethod.POST,produces="application/json;charset=UTF-8")
//    @ResponseBody
    @PostMapping("/addUser")
//    @ApiOperation(value = "添加数据", notes = "添加数据", httpMethod = "POST", produces = MediaType.APPLICATION_JSON_VALUE)
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
