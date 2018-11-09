package com.example.demo.mapper;

import com.example.demo.pojo.TUser;
import com.example.demo.utils.MyMapper;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface TUserMapperCustom extends MyMapper<TUser> {


   List<TUser> queryUserSimplyTnfoById(Integer id);


}