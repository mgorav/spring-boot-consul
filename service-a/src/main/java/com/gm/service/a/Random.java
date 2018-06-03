package com.gm.service.a;

class Random<Double> {

    double getValue() {
        double value = Math.random();
        System.out.println("Test I am here " + value);
        return value;
    }
}
