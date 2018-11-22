package com.example.demo.service;

import com.example.demo.pojo.TBookPO;
import com.example.demo.pojo.TDesk;

import java.util.List;

public interface TBookService {
     List<TBookPO> queryUserList(TBookPO tBookPO);
     List<TDesk> queryTDeskList(TDesk tDesk);
     Integer deleteUser(TBookPO tBookPO);
     Integer updateUser(TBookPO tBookPO);
}
