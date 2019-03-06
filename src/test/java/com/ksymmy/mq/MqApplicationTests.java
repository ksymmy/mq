package com.ksymmy.mq;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MqApplicationTests {

    @Resource
    private MsgProducer msgProducer;

    @Test
    public void contextLoads() {
        for (int i = 0; i < 100; i++) {

        }
        msgProducer.sendMsg("丫丫");
    }

}
