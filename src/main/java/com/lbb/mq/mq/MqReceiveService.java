package com.lbb.mq.mq;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

import javax.jms.Message;
import javax.jms.TextMessage;

@Service
public class MqReceiveService {

    @JmsListener(destination = "test")
    public void test(Message message) throws Exception{
        String str = ((TextMessage)message).getText();
        System.out.println("通过JmsListener："+str);
    }
}
