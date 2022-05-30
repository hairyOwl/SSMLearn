package com.owl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @version: 1.0
 * @author: 小哈
 * @date: 2022/5/27 10:54
 */

//@ResponseBody //这个类的所有方法返回的数据直接写给浏览器 (对象会转为Json)
//@Controller
@RestController //复合@ResponseBody @Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello quicker！！";
    }

}
