package com.example.demo.service.serviceImpl;

import com.example.demo.mapper.TBookMapper;
import com.example.demo.pojo.TBookPO;
import com.example.demo.service.TBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TBookServiceImpl implements TBookService {

    TBookMapper tBookMapper;

    @Override
    public List<TBookPO> queryUserList(TBookPO tBookPO) {
        return tBookMapper.queryUserList(tBookPO);
    }
}
