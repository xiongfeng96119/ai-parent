package cn.itsource.laigou.client.impl;

import cn.itsource.laigou.client.RedisClient;


public class RedisClientImpl implements RedisClient {

    @Override
    public String get(String key) {
        return "{\"message\":\"服务器异常!\"}";
    }

    @Override
    public void set(String key, String value) {

    }
}
