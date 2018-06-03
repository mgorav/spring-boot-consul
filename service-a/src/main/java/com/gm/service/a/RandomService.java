package com.gm.service.a;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("service-b")
interface RandomService {

    @RequestMapping(method = RequestMethod.GET, value = "/calling-service-b")
    Random<Integer> getInteger();


}
