package com.zheng.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zheng.mapper.UserMapper;
import com.zheng.pojo.User;
import com.zheng.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zy
 * @date 2021-10-21
 */

// 实现接口 UserService 里面的方法 ctrl+i ,但是要用 UserMapper来调用，UserService 只是方便来时线接口里面的方法
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService {

    @Autowired
    private UserMapper userMapper;

    // 增加一个人

    // 删除一个人

    // 改一个人

    // 查一个人

    // 查询所有的人



    // 查询所有相同的名字【使用的是自定实现的方法】
    @Override
    public List<User> findUserByName(String name) {
        List<User> userList = userMapper.findUserByName(name);
        return userList;
    }


}
