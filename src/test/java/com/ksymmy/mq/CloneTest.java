package com.ksymmy.mq;

import com.rabbitmq.tools.json.JSONUtil;

/**
 * @author: created by ksymmy@163.com at 2020/11/28 8:27
 * @desc:
 */
public class CloneTest {

    public static void main(String[] args) throws Exception{
        User u1 = new User("zhangsan");
        User u2 = (User) u1.clone();
        u1.setName("z1");
        System.out.println(u1.toString());
        System.out.println(u2.toString());
    }

}
