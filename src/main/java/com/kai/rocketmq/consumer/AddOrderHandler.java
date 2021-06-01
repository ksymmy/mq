package com.kai.rocketmq.consumer;

import com.alibaba.fastjson.JSON;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 消费消息业务处理类 <br/>
 * 处理MQ消息-添加用户
 *
 * @author 言曌
 * @date 2020/9/15 11:33 下午
 */
@Service("addOrderHandler")
public class AddOrderHandler extends AbstractMqConsumerServiceImpl {
    private static final Logger log = LoggerFactory.getLogger(AddOrderHandler.class);

    @Override
    public ConsumeConcurrentlyStatus handle(String message) {
        log.info("mq消息处理开始【添加订单】，message={}", message);
        try {
            Order order = JSON.parseObject(message, Order.class);
            // 模拟做业务操作
            // ....
            System.out.println(order.toString());
        } catch (Exception e) {
            log.error("handler error:{}", e.getMessage());
            return ConsumeConcurrentlyStatus.RECONSUME_LATER;
        }
        return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
    }
}