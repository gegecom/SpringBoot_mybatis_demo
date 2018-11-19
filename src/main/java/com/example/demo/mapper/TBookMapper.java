package com.example.demo.mapper;

import com.example.demo.pojo.TBookPO;
import com.example.demo.pojo.TUser;

import java.util.List;

public interface TBookMapper {

    public  List<TBookPO> queryUserList(TBookPO tBookPO);
}
