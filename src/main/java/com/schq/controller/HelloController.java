package com.schq.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLOutput;

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

    @GetMapping("/xiaoqinag66666666666666")
    public String xiaoqiang(){
        return "hq99999988888888888";
    }

    //周雨333333333333

    @GetMapping("/zhouyu")
    public String zhouyu() {
        return "zhouyu";
    }
    //333333

    @PostMapping("/哈哈哈")
    public String xiaoqiang2(){
        return "hahha99999999999999999999999";
    }
}
//99999999999999999999