 package com.yingxiongraoming.modular.listener;


 import org.springframework.beans.factory.annotation.Value;
 import org.springframework.cloud.stream.annotation.EnableBinding;
 import org.springframework.cloud.stream.annotation.StreamListener;
 import org.springframework.cloud.stream.messaging.Sink;
 import org.springframework.messaging.Message;
 import org.springframework.stereotype.Component;

 /**
  * @author yingxiongraoming
  * @date 2021/01/12
  */
 @Component
 @EnableBinding(Sink.class) //定义消息的接收管道
 public class MQMessageListener {

     @Value("${server.port}")
     private String serverPort;

     @StreamListener(Sink.INPUT)
     public void input(Message<String> message) {
         System.out.println(message.getPayload() + "\t  port: " + serverPort);
     }
 }