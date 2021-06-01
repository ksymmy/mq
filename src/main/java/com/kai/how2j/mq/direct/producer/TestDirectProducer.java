package com.kai.how2j.mq.direct.producer;

import com.kai.how2j.mq.util.RabbitMQUtil;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.nio.charset.StandardCharsets;

/**
 * @author: created by ksymmy@163.com at 2019/6/20 17:22
 * @desc:
 */
public class TestDirectProducer {
    private final static String QUEUE_NAME = "direct_queue";

    public static void main(String[] args) throws Exception {
        RabbitMQUtil.checkServer();

        //创建连接工厂
        ConnectionFactory factory = new ConnectionFactory();
        //设置RabbitMQ相关信息
        factory.setHost("localhost");
        //创建一个新的连接
        Connection connection = factory.newConnection();
        //创建一个通道
        Channel channel = connection.createChannel();

        channel.exchangeDeclare(QUEUE_NAME,"direct",true);

//        for (int i = 0; i < 10; i++) {
//            String message = "direct 消息 " + i;
//            //发送消息到队列中
//            channel.basicPublish("", QUEUE_NAME, null, message.getBytes(StandardCharsets.UTF_8));
//            System.out.println("发送消息： " + message);
//        }
        long currentTimeMillis = System.currentTimeMillis();
        while (System.currentTimeMillis() - currentTimeMillis <= 60000) {
            String message = "direct 消息 " + System.currentTimeMillis();
            //发送消息到队列中
            channel.basicPublish("", QUEUE_NAME, null, message.getBytes(StandardCharsets.UTF_8));
            System.out.println("发送消息： " + message);
            Thread.sleep(1000L);
        }
        //关闭通道和连接
        channel.close();
        connection.close();
    }
}
