package com.shengkf.springcloud_customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hcmony on 2017/9/5.
 */
@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("/testdemo")
    public String test(){
        return  testService.test();
    }

}
