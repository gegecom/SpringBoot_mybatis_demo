package com.example.demo.mapper;

import com.example.demo.pojo.TUser;
import com.example.demo.utils.MyMapper;

import java.util.List;

public interface TUserMapper extends MyMapper<TUser> {


//    @Insert("insert into t_user(userName,userAge,userAddress) values (#{userName},#{userAge},#{userAddress})")
//    public void addUser(TUser user);
//
//    @Delete("delete from t_user where id=#{id}")
//    public void deleteUser(int id);
//
//    @Update("update t_user set userName=#{userName},userAge=#{userAge},userAddress=#{userAddress} where id=#{id}")
//    public void updateUser(TUser user);
//
//    @Select("select * from t_user where userId = #{id}")
//    public TUser selectUserById(int id);
//
//    @Select("select * from t_user where userName = #{userName}")
//    public List<TUser> selectUserByName(String userName);





}