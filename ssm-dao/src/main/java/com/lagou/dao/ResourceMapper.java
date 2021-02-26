package com.lagou.dao;

import com.lagou.domain.PromotionAd;
import com.lagou.domain.Resource;
import com.lagou.domain.ResourseVo;

import java.util.List;

public interface ResourceMapper {


    /*（
        资源分页&多条件查询
     */

    public List<Resource> findAllResourceByPage(ResourseVo resourseVo);

    /*
        添加资源
     */
    public void saveResource(Resource resource);

    /*
         根据Id查询资源信息
    */
    public Resource findResourceById(int id);

    /*
         更新资源
     */
    public void updateResource(Resource resource);

    /*
        删除资源
     */

    public void deleteResource(Integer id);


}
