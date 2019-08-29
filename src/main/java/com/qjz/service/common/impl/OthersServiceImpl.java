package com.qjz.service.common.impl;

import com.fanglin.common.utils.JedisUtils;
import com.fanglin.common.utils.OthersUtils;
import com.fanglin.common.utils.SmsUtils;
import com.qjz.enums.others.RedisKeyEnum;
import com.qjz.mapper.MapperFactory;
import com.qjz.service.common.OthersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;


/**
 * 其他服务实现类
 *
 * @author 彭方林
 * @version 1.0
 * @date 2019/4/3 16:36
 **/
@Service
public class OthersServiceImpl implements OthersService {

    @Autowired
    MapperFactory mapperFactory;

    @Override
    public void sendCode(String mobile, String type) {
        String code = OthersUtils.randomString(4);
        String key = String.format("%s:%s:%s:%s", RedisKeyEnum.CODE.getKey(), type, mobile, code);
        String params = String.format("{\"code\":\"%s\"}", code);
        SmsUtils.aliCode(mobile, "趣兼职", type, params);
        try (Jedis jedis = JedisUtils.getJedis()) {
            jedis.set(key, "", "ex", 600);
        }
    }

    @Override
    public String sendTestCode(String mobile, String type) {
        String code = OthersUtils.randomString(4);
        String key = String.format("%s:%s:%s:%s", RedisKeyEnum.CODE.getKey(), type, mobile, code);
        try (Jedis jedis = JedisUtils.getJedis()) {
            jedis.set(key, "", "ex", 600);
        }
        return code;
    }
}
