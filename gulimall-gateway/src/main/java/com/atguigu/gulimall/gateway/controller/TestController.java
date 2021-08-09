package com.atguigu.gulimall.gateway.controller;

import com.atguigu.common.utils.R;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Cx
 * @Date 2021-08-06
 * @Version 1.0
 */
@RefreshScope
@RestController
@RequestMapping("test")
public class TestController {

    @Value("${test.user.name}")
    String name;

    @RequestMapping("/name")
    public R test(){
        return R.ok().put("name",name);
    }
}
