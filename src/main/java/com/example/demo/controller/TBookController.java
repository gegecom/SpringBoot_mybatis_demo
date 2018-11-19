package com.example.demo.controller;

import com.example.demo.pojo.TBookPO;
import com.example.demo.service.TBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TBookController {
    @Autowired
    TBookService tBookService;

    @GetMapping("/queryList/{userName}")
    public List<TBookPO> queryTBookList(@PathVariable(value="userName") String userName){
        TBookPO po = new TBookPO();
        po.setUserName(userName);
        return tBookService.queryUserList(po);
    }
}