package com.haibo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2018/4/7/007.
 */
@Controller
public class main {
    @RequestMapping("/")
    @ResponseBody
    public String index(){
        return "hello world";
    }
}