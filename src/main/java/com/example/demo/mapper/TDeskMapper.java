package com.example.demo.mapper;

import com.example.demo.pojo.TDesk;

import java.util.List;

public interface TDeskMapper {
    public List<TDesk> queryDeskList(TDesk tDesk);
}
