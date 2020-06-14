package com.example.springaoplearn.proxy.dynamicproxy;

import com.example.springaoplearn.proxy.staticproxy.Sell;

/**
 * Created by louxiu
 */

public class Vender implements Sell {
    @Override
    public void sell() {
        System.out.println("VenderSell");
    }

    @Override
    public void count() {
        System.out.println("VenderCount");

    }
}
