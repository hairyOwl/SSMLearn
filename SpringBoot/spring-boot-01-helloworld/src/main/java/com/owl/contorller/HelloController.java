package com.owl.contorller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @description: HelloWorld控制类
 * @version: 1.0
 * @author: 小哈
 * @date: 2022/5/21 19:04
 */

//标注一个注解类
@Controller
public class HelloController {

    //接收Hello请求
    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "Hello World";
    }
}
