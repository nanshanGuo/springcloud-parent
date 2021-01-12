package com.yingxiongraoming.modular.service.impl;

import com.yingxiongraoming.modular.service.IMessageProvider;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @author yingxiongraoming
 * @date 2021/01/11
 */
@EnableBinding(Source.class) // 定义消息的推送管道
public class IMessageProviderImpl implements IMessageProvider {

    @Resource
    private MessageChannel output; // 消息发送管道

    public String send() {
        String serial = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build());
        return serial;
    }
}