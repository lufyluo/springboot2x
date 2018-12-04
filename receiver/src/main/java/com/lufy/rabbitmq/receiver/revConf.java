package com.lufy.rabbitmq.receiver;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class revConf {
    @Bean
    public Queue queue() {
        return new Queue("queue");
    }
}
