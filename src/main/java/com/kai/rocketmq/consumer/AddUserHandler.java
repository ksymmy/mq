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
@Service("addUserHandler")
public class AddUserHandler extends AbstractMqConsumerServiceImpl {
    private static final Logger log = LoggerFactory.getLogger(AddUserHandler.class);

    @Override
    public ConsumeConcurrentlyStatus handle(String message) {
        log.info("mq消息处理开始【添加用户】，message={}", message);
        try {
            UserDTO user = JSON.parseObject(message, UserDTO.class);
            // 模拟做业务操作
            // ....
            System.out.println(user.toString());
        } catch (Exception e) {
            log.error("handler error:{}", e.getMessage());
            return ConsumeConcurrentlyStatus.RECONSUME_LATER;
        }
        return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
    }
}