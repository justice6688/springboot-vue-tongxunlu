package com.zheng.controller;

import com.alibaba.fastjson.JSON;
import com.zheng.pojo.User;
import com.zheng.service.UserService;
import com.zheng.service.impl.UserServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

/**
 * @author zy
 * @date 2021-10-21
 */

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/query")
    public String queryAll() {
        HashMap<String, Object> data = new HashMap<>();
        List<User> userList = userService.list(null);
        if (userList != null) {
            data.put("data", userList);
            data.put("status", 200);
        } else {
            data.put("status", 400);
        }
        String json = JSON.toJSONString(data);
        return json;
    }


    // 增加一个人 localhost:8080/addUser?Fname=1&Fphone=12&Faddress=13
    @PostMapping("/addUser")
    public String addUser(@RequestBody User user) {
        boolean flag = userService.save(user);
        return flag == true ? "success" : "error";
    }

    // 删除一个人 localhost:8080/deleteUser?id=1
    @RequestMapping("/deleteUser")
    public String deleteUser(int id) {
        boolean flag = userService.removeById(id);
        return flag == true ? "success" : "error";
    }

    // 改一个人   @JsonProperty(value = "Fphone")
    @PostMapping("/editUser")
    public String editUser(@RequestBody User user) {
        System.out.println(user);
        boolean flag = userService.updateById(user);
        return flag == true ? "success" : "error";
    }

    // 查一个人   localhost:8080/getUser?id=1
    @RequestMapping("/getUser")
    public String getUser(int id) {
        User user = userService.getById(id);
        String json = JSON.toJSONString(user);
        return json;
    }



    // 查询所有的人   localhost:8080/findUserByName?name=Tom
    @GetMapping("/findUserByName")
    public String findAll(String name) {
        List<User> userList = userService.findUserByName(name);
        String json = JSON.toJSONString(userList);
        return json;
    }

    @PostMapping("/test1")
    public String test1(@RequestBody String test1){
        System.out.println(test1);
        return test1;
    }

}
