package com.gm.service.a;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    private RandomService randomService;

    @RequestMapping("/int")
    public double showRandomInteger() throws InterruptedException {
        double val = randomService.getInteger().getValue();
        System.out.print(">>Val: " + val);
        return val;

    }

}
