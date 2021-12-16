package com.zheng;

import com.zheng.mapper.UserMapper;
import com.zheng.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class TongxunluApplicationTests {

    @Autowired
    private UserMapper userMapper;

    // 查询所有
    @Test
    void contextLoads() {
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
    }

    // 删除一个人
    @Test
    public void deleteOne(){
        int i = userMapper.deleteById(3);
        System.out.println("删除了 " + i + "人！");
    }

}
