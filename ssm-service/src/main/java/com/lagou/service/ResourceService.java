package com.lagou.service;

import com.github.pagehelper.PageInfo;
import com.lagou.domain.Resource;
import com.lagou.domain.ResourseVo;

public interface ResourceService {
    PageInfo<Resource> findAllResourceByPage(ResourseVo resourseVo);

    void saveResource(Resource resource);

    void updateResource(Resource resource);

    Resource findResourceById(int id);

    void deleteResource(Integer id);
}
