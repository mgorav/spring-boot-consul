package com.gm.service.a;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class RandonPing {
    @Autowired
    private RandomService service;

    @Scheduled(fixedRate = 100L)
    public void ping() {
        System.out.println("Pinging ....");
        System.out.println("Value >> " + service.getInteger().getValue());
    }
}
