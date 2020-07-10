package com.example.demo.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author xiaoyin
 * @date 2020/7/10 22:20
 */
@Configuration
public class RabbitMQConfiguration {
    @Bean
    public Queue queue() {
        //helloRabbit 队列名称
        return new Queue("helloRabbit");
    }
}