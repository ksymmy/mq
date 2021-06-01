package com.ksymmy.mq;

import com.kai.rabbitmq.MsgProducer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.time.LocalDateTime;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MqApplicationTests {

    @Resource
    private MsgProducer msgProducer;

    @Test
    public void contextLoads() throws InterruptedException {
        while (true) {
            Thread.sleep(2000L);
            msgProducer.sendMsg("丫丫" + LocalDateTime.now());
        }
    }

}
