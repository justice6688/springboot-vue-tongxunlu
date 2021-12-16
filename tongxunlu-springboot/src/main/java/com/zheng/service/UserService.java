package com.zheng.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zheng.pojo.User;

import java.util.List;

/**
 * @author zy
 * @date 2021-10-21
 */

public interface UserService extends IService<User> {

    List<User> findUserByName(String name);
}
