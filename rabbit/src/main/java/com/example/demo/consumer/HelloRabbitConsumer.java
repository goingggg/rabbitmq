package com.example.demo.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
/**
 * @author xiaoyin
 * @date 2020/7/10 22:21
 * @RabbitListener(queues = "helloRabbit")监听的队列
 */
@Component
@RabbitListener(queues = "helloRabbit")
public class HelloRabbitConsumer {
    //消息的处理
    @RabbitHandler
    public void process(String message) {
        System.out.println("Consumer: " + message);
    }
}
