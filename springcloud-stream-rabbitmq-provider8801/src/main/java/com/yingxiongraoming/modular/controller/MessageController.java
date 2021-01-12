 package com.yingxiongraoming.modular.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yingxiongraoming.modular.service.IMessageProvider;

/**
 * @author ndcadmin
 * @date 2021/01/11
 */
@RestController
public class MessageController {

    
    @Resource
    private IMessageProvider messageProvider;

    @GetMapping(value = "/sendMessage")
    public String sendMessage() {
        return messageProvider.send();
    }
    
}
