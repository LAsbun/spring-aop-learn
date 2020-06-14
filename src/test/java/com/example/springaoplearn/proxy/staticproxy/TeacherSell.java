package com.example.springaoplearn.proxy.staticproxy;

/**
 * Created by sws
 */

public class TeacherSell implements Sell {
    @Override
    public void sell() {

        System.out.println("TeacherSell");
    }

    @Override
    public void count() {
        System.out.println("TeacherCount");

    }
}
