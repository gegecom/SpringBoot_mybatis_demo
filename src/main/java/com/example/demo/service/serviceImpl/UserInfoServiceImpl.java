package com.example.demo.service.serviceImpl;

import com.example.demo.mapper.UserInfoMapper;
import com.example.demo.pojo.UserInfoPO;
import com.example.demo.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    UserInfoMapper  userInfoMapper;

    @Override
    public int addUserInfo(UserInfoPO po) {

        return userInfoMapper.insertUserInfo(po);
    }
}
