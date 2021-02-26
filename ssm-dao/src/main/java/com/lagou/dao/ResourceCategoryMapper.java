package com.lagou.dao;

import com.lagou.domain.PromotionSpace;
import com.lagou.domain.ResourceCategory;

import java.util.List;

public interface ResourceCategoryMapper {

    /*
        查询所有资源分类
     */
    public List<ResourceCategory> findAllResourceCategory();

    /*
        添加资源分类
     */
    public void saveResourceCategory(ResourceCategory resourceCategory);

    /*
         根据Id查询资源分类信息
    */
    public ResourceCategory findResourceCategoryById(int id);

    /*
         更新资源分类名称
     */
    public void updateResourceCategory(ResourceCategory resourceCategory);

    /*
        删除资源分类
     */

    public void deleteResourceCategory(Integer id);


}
