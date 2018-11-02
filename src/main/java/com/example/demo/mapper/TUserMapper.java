package com.example.demo.mapper;

import com.example.demo.pojo.TUser;
import com.example.demo.utils.MyMapper;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface TUserMapper extends MyMapper<TUser> {


    @Select("select * from t_user where userId = #{id}")
    public TUser selectUserById(int id);

    @Select("select * from t_user where userName = #{userName}")
    public List<TUser> selectUserByName(String userName);

    @Insert("insert into t_user(userName,userAge,userAddress) values (#{userName},#{userAge},#{userAddress})")
    public void addUser(TUser user);

    @Update("update t_user set userName=#{userName},userAge=#{userAge},userAddress=#{userAddress} where id=#{id}")
    public void updateUser(TUser user);

    @Delete("delete from t_user where id=#{id}")
    public void deleteUser(int id);


}