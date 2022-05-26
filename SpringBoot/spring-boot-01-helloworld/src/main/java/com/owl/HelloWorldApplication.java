package com.owl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @description: 主程序
 * @version: 1.0
 * @author: 小哈
 * @date: 2022/5/21 11:25
 */

/*
* @SpringBootApplication 标注一个主程序类 , 说明这是一个spring boot应用
* */
@SpringBootApplication
public class HelloWorldApplication {

    public static void main(String[] args) { //args：main方法中的可变参数
        //Spring 应用启动类
        SpringApplication.run(HelloWorldApplication.class,args);
    }
}
