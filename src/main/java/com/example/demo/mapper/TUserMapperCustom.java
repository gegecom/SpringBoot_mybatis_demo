package com.example.demo.mapper;

import com.example.demo.pojo.TUser;
import com.example.demo.utils.MyMapper;
import java.util.List;

public interface TUserMapperCustom extends MyMapper<TUser> {


   List<TUser> queryUserSimplyTnfoById(Integer id);


}