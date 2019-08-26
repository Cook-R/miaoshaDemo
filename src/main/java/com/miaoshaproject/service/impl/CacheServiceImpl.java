package com.miaoshaproject.service.impl;/*
 @author -xxx
 @DESCRIPTION 
 @create 2019/8/22
*/

import com.google.common.cache.Cache;
import com.miaoshaproject.service.CacheService;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.concurrent.TimeUnit;

@Service
public class CacheServiceImpl implements CacheService {

    private Cache<String,Object> commomCache = null;

    @PostConstruct
    public void init() {
        commomCache= com.google.common.cache.CacheBuilder.newBuilder()
                //设置缓存容器的处事容量为10
                .initialCapacity(10)
                //设置缓存中最大可以存储100个key，超过100个之后会按照lru的策略一处缓存项
                .maximumSize(100)
                //设置写缓存后多少秒过期
                .expireAfterWrite(60,TimeUnit.SECONDS).build();
    }


    @Override
    public void setCommonCache(String key, Object value) {
        commomCache.put(key, value);
    }

    @Override
    public Object getFromCommonCache(String key) {
        return commomCache.getIfPresent(key);
    }
}
