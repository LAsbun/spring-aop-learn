package com.example.springaoplearn.proxy.staticproxy;

/**
 * Created by sws
 */

public class SellAgent {

    private Sell sell;

    public SellAgent(Sell sell) {
        this.sell = sell;
    }

    public void sellAgent() {
        sell.sell();
    }

    public void sellCountAgent() {
        sell.count();
    }


    public static void main(String[] args) {
        SellAgent dtuAgent = new SellAgent(new StudentSell());

        dtuAgent.sellAgent();
    }
}
