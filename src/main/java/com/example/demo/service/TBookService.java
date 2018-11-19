package com.example.demo.service;

import com.example.demo.pojo.TBookPO;

import java.util.List;

public interface TBookService {
    public List<TBookPO> queryUserList(TBookPO tBookPO);
}
