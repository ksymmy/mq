package com.kai.rocketmq.consumer;

import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;

import java.util.Date;

/**
 * @author 消费服务接口
 * @date 2020/9/16 6:22 下午
 */
public interface MqConsumerService {
    /**
     * 前置
     *
     * @param message
     * @return
     */
    ConsumeConcurrentlyStatus beforeHandler(String message);

    /**
     * 消息处理
     *
     * @param message
     * @return
     */
    ConsumeConcurrentlyStatus handle(String message);

    /**
     * 后置
     *
     * @param message
     * @param startHandlerTime
     * @param status
     */
    void afterHandler(String message, Date startHandlerTime, ConsumeConcurrentlyStatus status);
}