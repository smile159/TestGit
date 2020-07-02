package com.schq.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * \* Desc:
 * \* User: HQ
 * \* Date: 2020/7/2  20:22
 * \
 */
@RestController
public class HelloController {

    @RequestMapping("/")
    public String hello(){
        return "Hello hello Git...!";
    }
}
