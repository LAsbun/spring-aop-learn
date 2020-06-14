package com.example.springaoplearn.proxy.staticproxy;

/**
 * Created by sws
 */

public class StudentSell implements Sell {
    @Override
    public void sell() {
        System.out.println("StudentSell");
    }

    @Override
    public void count() {
        System.out.println("StudentCount");

    }
}
