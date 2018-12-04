package com.lufy.rabbitmq.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "helloQueue")
public class HelloReceive {

//    //监听器监听指定的Queue
//    @RabbitListener(queues = "queue")
//    public void processC(String str) {
//        System.out.println("Receive1:" + str);
//    }

    @RabbitHandler
    public void processD(String str) {
        System.out.println("Receiver1:" + str);
    }
}