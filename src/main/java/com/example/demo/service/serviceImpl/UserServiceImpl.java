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

   @Autowired
    public void saveUser(TUser user) {
       userMapper.insert(user);
    }


    @Autowired
    public void updateUser(TUser user){

    }


    @Autowired
    public void deleteUser(String userName){

    }
//    @Autowired
//    public TUser queryUserByUserName(String UserName){
//      TUser u = new TUser();
//      return  u;
//    }

    @Autowired
    public List<TUser> queryUserList(TUser user){
        List<TUser> LU = null;
        return  LU;
    }


    public TUserMapper getUserMapper() {
        return userMapper;
    }

    public void setUserMapper(TUserMapper userMapper) {
        this.userMapper = userMapper;
    }
}
