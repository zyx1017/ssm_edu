package com.lagou.service;

import com.lagou.domain.PromotionSpace;

import java.util.List;

public interface PromotionSpaceService {
    List<PromotionSpace> findAllPromotionSpace();

    void savePromotionSpace(PromotionSpace promotionSpace);

    /*
            根据ID查询广告位信息
         */
    PromotionSpace findPromotionSpaceById(int id);

    /*
            修改广告位名称
         */
    void updatePromotionSpace(PromotionSpace promotionSpace);
}
