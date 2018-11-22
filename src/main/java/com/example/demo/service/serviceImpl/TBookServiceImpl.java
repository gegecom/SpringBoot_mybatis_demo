package com.example.demo.service.serviceImpl;

import com.example.demo.mapper.TBookMapper;
import com.example.demo.pojo.TBookPO;
import com.example.demo.service.TBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TBookServiceImpl implements TBookService {
    @Autowired
    TBookMapper tBookMapper;
    @Autowired
    TDeskMapper tDeskMapper;


    @Override
    public List<TBookPO> queryUserList(TBookPO tBookPO) {
        return tBookMapper.queryUserList(tBookPO);
    }

    @Override
    public Integer updateUser(TBookPO tBookPO){
        return  tBookMapper.updateUser(tBookPO);
    }

    public Integer deleteUser(TBookPO tBookPO){
        return  tBookMapper.deleteUser(tBookPO);
    }

    @Override
    public List<TDesk> queryTDeskList(TDesk tDesk){
        return  tDeskMapper.queryDeskList(tDesk);
    };
}
