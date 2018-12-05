package com.lufy.rabbitmq.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component

public class TopicMessageReceiver {

    @RabbitListener(queues = "topic.message")
    public void process(String msg) {
        System.out.println("topicMessageReceiver  : " +msg);
    }
    @RabbitListener(queues = "topic.messages")
    public void process1(String msg) {
        System.out.println("topicMessageReceiver s  : " +msg);
    }

}
