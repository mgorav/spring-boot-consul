package com.gm.service.b;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@RestController
public class Controller {

    @RequestMapping(value = "/calling-service-b", method = RequestMethod.GET)
    public Map<String, Integer> integer() {
        System.out.println("Hi there I am service - B");
        Random random = new Random();
        Map<String, Integer> response = new HashMap<>(1);
        response.put("value", random.nextInt());
        return response;
    }

}
