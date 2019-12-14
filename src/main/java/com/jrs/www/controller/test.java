package com.jrs.www.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName test
 * @Author xuepengbo
 * @Date 2019/12/14 0014 19:23
 * @Version 1.0
 * @Description
 **/
@RestController
public class test {

    @RequestMapping(value = "test", method = RequestMethod.GET)
    public String test(){
        return "OK!";
    }
}
