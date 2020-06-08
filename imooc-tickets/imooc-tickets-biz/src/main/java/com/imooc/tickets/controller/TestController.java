package com.imooc.tickets.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RefreshScope
@RestController
public class TestController {

    @Value("${imooc.user.name}")
    String name;

    @GetMapping("test")
    public JSONObject test(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name",name);
        return jsonObject;
    }
}
