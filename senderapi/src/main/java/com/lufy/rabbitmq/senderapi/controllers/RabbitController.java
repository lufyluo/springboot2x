package com.lufy.rabbitmq.senderapi.controllers;

import com.lufy.rabbitmq.senderapi.Services.HelloSender1;
import com.lufy.rabbitmq.senderapi.Services.HelloSender2;
import com.lufy.rabbitmq.senderapi.Services.TopicSender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rabbit")
public class RabbitController {
    @Autowired
    private HelloSender1 helloSender1;
    @Autowired
    private HelloSender2 helloSender2;
    @Autowired
    private TopicSender topicSender;

    @GetMapping("/hello1")
    public void hello1(){
        helloSender1.send();
    }
    @GetMapping("/hello2")
    public void hello2(){
        helloSender2.send();
    }
    @GetMapping("/topic")
    public void topicSender(){
        topicSender.send();
    }
}
