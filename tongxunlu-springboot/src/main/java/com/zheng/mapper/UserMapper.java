package com.zheng.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zheng.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author zy
 * @date 2021-10-21
 */

@Repository
public interface UserMapper extends BaseMapper<User> {

    // 1.直接用

    // 2.写接口方法
    List<User> findUserByName(String name);
}
