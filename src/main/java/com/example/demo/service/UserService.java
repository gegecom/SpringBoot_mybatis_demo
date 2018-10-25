package com.example.demo.service;

import com.example.demo.pojo.TUser;

import java.util.List;

public interface UserService {
    public void saveUser(TUser user) throws Exception;

    public void updateUser(TUser user);

    public void deleteUser(String userName);

//    public TUser queryUserByUserName(String UserName);

    public List<TUser> queryUserList(TUser user);
}
