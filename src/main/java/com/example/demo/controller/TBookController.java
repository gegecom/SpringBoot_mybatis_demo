package com.example.demo.controller;

import com.example.demo.pojo.TBookPO;
import com.example.demo.pojo.TDesk;
import com.example.demo.service.TBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Response;
import java.util.List;

@RestController
public class TBookController {
    @Autowired
    TBookService tBookService;

    @GetMapping("/queryList/{userName}")
    public ResponseEntity queryTBookList(@PathVariable(value="userName") String userName){
        TBookPO po = new TBookPO();
        po.setUserName(userName);
        return ResponseEntity.ok(tBookService.queryUserList(po));
    }

    @GetMapping("/queryTDeskList/{userName}")
    public ResponseEntity queryTDeskList(@PathVariable(value="userName") String userName){
        TDesk po = new TDesk();
        po.setUserName(userName);
        return ResponseEntity.ok(tBookService.queryTDeskList(po));
    }
}
