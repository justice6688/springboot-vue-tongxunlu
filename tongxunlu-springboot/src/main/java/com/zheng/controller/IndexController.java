package com.zheng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zy
 * @date 2021-10-24
 */

@Controller
public class IndexController {
    @RequestMapping("/")
    public String index(){
        return "forward:/index.html";
    }
}
