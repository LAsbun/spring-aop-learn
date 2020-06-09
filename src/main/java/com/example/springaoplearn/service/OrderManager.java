package com.example.springaoplearn.service;

import com.example.springaoplearn.aop.AuthAspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class OrderManager {

    @Autowired
    AuthManager authManager;

    @Autowired
    LogManager logManager;

    @AuthAspect
    public void selectOrder() {

//        logManager.log();

        // 鉴权
//        authManager.auth();

        System.out.println("查询到订单");
    }
}
