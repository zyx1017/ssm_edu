package com.lagou.dao;

import com.lagou.domain.PromotionAd;
import com.lagou.domain.PromotionSpace;

import java.util.List;

public interface PromotionAdMapper {
    /*
        分页查询广告信息
     */
    public List<PromotionAd> findAllPromotionAdByPage();

    /*
        添加广告
     */
    public void savePromotionAd(PromotionAd promotionAd);

    /*
         根据Id查询广告信息
    */
    public PromotionAd findPromotionAdById(int id);

    /*
         更新广告名称
     */
    public void updatePromotionAd(PromotionAd promotionAd);

    /**
     *    广告状态上下线
     */
    public void updatePromotionAdStatus(PromotionAd promotionAd);

}
