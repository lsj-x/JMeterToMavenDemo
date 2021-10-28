package com.atguigu.demo.controller;

import com.sun.org.apache.bcel.internal.generic.RETURN;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountController {
   // private int i=0;
    @Autowired
    StringRedisTemplate redisTemplate;
    @GetMapping("/hello")
    public String count(){
        Long incremnt = redisTemplate.opsForValue().increment("count-pepole");
        return  "有【" +incremnt+"】 人访问了这个页面";
    }
}
