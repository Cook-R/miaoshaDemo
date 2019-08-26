package com.miaoshaproject.service;/*
 @author -xxx
 @DESCRIPTION 
 @create 2019/8/4
*/

import com.miaoshaproject.service.model.PromoModel;

public interface PromoService {

     PromoModel getPromoByItemId(Integer itemId);

     //活动发布
     void publishPromo(Integer promoId);

     //生成秒杀用的令牌
     String generateSecondKillToken(Integer promoId, Integer itemId, Integer userId);


}
