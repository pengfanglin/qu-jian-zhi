package com.qjz.controller;

import com.fanglin.common.core.others.Ajax;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.JedisPool;

import java.util.HashMap;
import java.util.Map;

/**
 * 远程控制
 *
 * @author 彭方林
 * @version 1.0
 * @date 2019/4/3 16:36
 **/
@RestController
@RequestMapping("/remote/")
@Api(value = "/remote/", tags = {"远程控制"})
public class RemoteController {

    @Autowired
    JedisPool jedisPool;

    @ApiOperation("查看redis连接信息")
    @PostMapping("redisInfo")
    public Ajax redisInfo() {
        Map<String, Object> info = new HashMap<>(4);
        info.put("active", jedisPool.getNumActive());
        info.put("idle", jedisPool.getNumIdle());
        info.put("wait", jedisPool.getNumWaiters());
        return Ajax.ok(info);
    }
}
