package com.example.demo.service.serviceImpl;

import com.example.demo.mapper.TUserMapper;
import com.example.demo.pojo.TUser;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private TUserMapper userMapper;

    @Override
    public void saveUser(TUser user) {
       userMapper.insert(user);
    }


    @Override
    public void updateUser(TUser user){

    }


    @Override
    public void deleteUser(String userName){

    }
//    @Override
//    public TUser queryUserByUserName(String UserName){
//      TUser u = new TUser();
//      return  u;
//    }

    @Override
    public List<TUser> queryUserList(TUser user){
        List<TUser> LU = null;
        return  LU;
    }

}
