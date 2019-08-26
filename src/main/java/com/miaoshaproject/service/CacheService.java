package com.miaoshaproject.service;/*
 @author -xxx
 @DESCRIPTION 
 @create 2019/8/21
*/

public interface CacheService {
    void setCommonCache(String key,Object value);

    Object getFromCommonCache(String key);

}
