package com.example.demo.mapper;

import com.example.demo.pojo.UserInfoPO;

import java.util.List;

public interface UserInfoMapper {

    public int insertUserInfo(UserInfoPO userInfoPO);

    public int delUserInfo(int id);

    public int updateUserInfo(UserInfoPO userInfoPO);

    public List<UserInfoPO> selectUserInfo(UserInfoPO userInfoPO);

}
