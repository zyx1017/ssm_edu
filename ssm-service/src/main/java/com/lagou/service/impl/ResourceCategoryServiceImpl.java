package com.lagou.service.impl;

import com.lagou.dao.ResourceCategoryMapper;
import com.lagou.dao.ResourceMapper;
import com.lagou.domain.Resource;
import com.lagou.domain.ResourceCategory;
import com.lagou.domain.ResourseVo;
import com.lagou.service.ResourceCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResourceCategoryServiceImpl implements ResourceCategoryService {

    @Autowired
    private ResourceCategoryMapper resourceCategoryMapper;
    @Autowired
    private ResourceMapper resourceMapper;


    @Override
    public List<ResourceCategory> findAllResourceCategory() {

        List<ResourceCategory> allResourceCategory = resourceCategoryMapper.findAllResourceCategory();

        return allResourceCategory;
    }

    @Override
    public void saveResourceCategory(ResourceCategory resourceCategory){
        resourceCategoryMapper.saveResourceCategory(resourceCategory);
    }

    @Override
    public ResourceCategory findResourceCategoryById(int id){
        ResourceCategory resourceCategoryById = resourceCategoryMapper.findResourceCategoryById(id);
        return resourceCategoryById;
    }

    @Override
    public void updateResourceCategory(ResourceCategory resourceCategory){
        resourceCategoryMapper.updateResourceCategory(resourceCategory);
    }

    @Override
    public void deleteResourceCategory(Integer id){
        //先删除与之关联的商品信息
        ResourseVo resourseVo = new ResourseVo();
        resourseVo.setCategoryId(id);
        List<Resource> allResourceByPage = resourceMapper.findAllResourceByPage(resourseVo);
        if(allResourceByPage != null){
            for (Resource resource : allResourceByPage) {
                resourceMapper.deleteResource(resource.getId());
            }
        }
        resourceCategoryMapper.deleteResourceCategory(id);

    }

}
