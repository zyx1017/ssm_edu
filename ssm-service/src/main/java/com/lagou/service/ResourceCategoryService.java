package com.lagou.service;

import com.lagou.domain.ResourceCategory;

import java.util.List;

public interface ResourceCategoryService {
    List<ResourceCategory> findAllResourceCategory();

    void saveResourceCategory(ResourceCategory resourceCategory);

    ResourceCategory findResourceCategoryById(int id);

    void updateResourceCategory(ResourceCategory resourceCategory);

    void deleteResourceCategory(Integer id);
}
