package com.example.demo.service.serviceImpl;

import com.example.demo.mapper.TUserMapper;
import com.example.demo.pojo.TUser;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private TUserMapper userMapper;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)//增删改需要以事务的形式来执行
    public void saveUser(TUser user) {
       userMapper.insert(user);
    }


    @Override
    public void updateUser(TUser user){
//        userMapper.updateByPrimaryKey(user);
        userMapper.updateByPrimaryKeySelective(user);
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
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<TUser> queryUserList(TUser user){
        List<TUser> LU = new ArrayList();
        TUser tu = userMapper.selectByPrimaryKey(user);
        LU.add(tu);
//        List<TUser> LU = userMapper.selectByPrimaryKey(user.getUserid());
//        Example example = new Example(user.getClass());
//        Example.Criteria criteria = example.createCriteria();
////        criteria.andLike("userName","% "+user.getUsername()+"%");
//        criteria.andGreaterThan("userId", 1001);
//        List<TUser> LU = userMapper.selectByExample(example);
////        List<TUser> LU = userMapper.selectUserByName(user.getUsername());
        return  LU;
    }

}
