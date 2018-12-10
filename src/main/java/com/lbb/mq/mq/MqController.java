package com.lbb.mq.mq;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.jms.Destination;

@Controller
public class MqController {

    @Autowired
    private MqSendService mqSendService;

    @RequestMapping("send")
    @ResponseBody
    public void send() throws Exception{
        Destination destination = new ActiveMQQueue("test");
        mqSendService.sendMessage(destination, "hello");
    }
}
