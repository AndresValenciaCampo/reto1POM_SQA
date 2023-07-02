package com.demoserenity.utils;

import com.demoserenity.steps.OrderSteps;

import java.util.concurrent.ThreadLocalRandom;

public class RandomOrderCustomerList {

    public static int selectCustomerOrder(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max);
    }
}
