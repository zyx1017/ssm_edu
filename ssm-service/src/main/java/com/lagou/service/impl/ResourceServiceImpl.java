package com.lagou.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lagou.dao.ResourceMapper;
import com.lagou.domain.PromotionAd;
import com.lagou.domain.Resource;
import com.lagou.domain.ResourseVo;
import com.lagou.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResourceServiceImpl implements ResourceService {

    @Autowired
    private ResourceMapper resourceMapper;


    @Override
    public PageInfo<Resource> findAllResourceByPage(ResourseVo resourseVo) {

        //分页查询
        PageHelper.startPage(resourseVo.getCurrentPage(),resourseVo.getPageSize());

        List<Resource> allResourceByPage = resourceMapper.findAllResourceByPage(resourseVo);

        PageInfo<Resource> pageInfo = new PageInfo<>(allResourceByPage);

        return pageInfo;
    }

    @Override
    public void saveResource(Resource resource) {
        resourceMapper.saveResource(resource);
    }

    @Override
    public void updateResource(Resource resource) {
        resourceMapper.updateResource(resource);
    }

    @Override
    public Resource findResourceById(int id) {
        Resource resource = resourceMapper.findResourceById(id);
        return resource;
    }

    @Override
    public void deleteResource(Integer id) {


        resourceMapper.deleteResource(id);
    }
}
