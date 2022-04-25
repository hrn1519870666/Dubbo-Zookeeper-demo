package com.kuang;

import com.kuang.consumer.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ConsumerServerApplicationTests {

    @Autowired
    UserService userService;

//    执行测试代码
//    前提（少一个都会报错） ：
//            1、Zookeeper 启动成功
//            2、Dubbo 启动成功
//            3、启动提供者服务
    @Test
    public void contextLoads() {

        userService.bugTicket();

    }

}