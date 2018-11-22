package com.example.demo.controller;

import com.example.demo.pojo.ServiceResult;
import com.example.demo.pojo.TBookPO;
import com.example.demo.pojo.TDesk;
import com.example.demo.service.TBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
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
    public ResponseEntity queryTDeskList(@PathVariable(value="userName") String userName) {
        TDesk po = new TDesk();
        po.setUserName(userName);
        return ResponseEntity.ok(tBookService.queryTDeskList(po));
    }
    @GetMapping("/queryList")
    public ServiceResult queryTBookList(Integer userId, String userName, String password, String phone){
        TBookPO tBookPO = new TBookPO();
        if (userId!=null){
            tBookPO.setUserId(userId);
        }
        if(userName!=null){
            tBookPO.setUserName(userName);
        }
        if(password!=null){
            tBookPO.setPassword(password);
        }
        if (phone!=null){
            tBookPO.setPhone(phone);
        }
//        List<TBookPO> listTBook = tBookService.queryUserList(tBookPO);
        return ServiceResult.ok(tBookService.queryUserList(tBookPO));
    }

    @RequestMapping("/deleteUser")
    public ServiceResult deleteUser(Integer userId, String userName, String password, String phone){
        TBookPO tBookPO = new TBookPO();
        if (userId!=null){
            tBookPO.setUserId(userId);
        }
        if(userName!=null){
            tBookPO.setUserName(userName);
        }
        if(password!=null){
            tBookPO.setPassword(password);
        }
        if (phone!=null){
            tBookPO.setPhone(phone);
        }

        return ServiceResult.ok(tBookService.deleteUser(tBookPO));

    }
}
