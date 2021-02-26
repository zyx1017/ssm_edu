package com.lagou.controller;

import com.lagou.domain.Resource;
import com.lagou.domain.ResourceCategory;
import com.lagou.domain.ResponseResult;
import com.lagou.service.ResourceCategoryService;
import com.lagou.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/ResourceCategory")
public class ResourceCategoryController {

    @Autowired
    private ResourceCategoryService resourceCategoryService;
    @Autowired
    private UserService userService;

    @RequestMapping("/findAllResourceCategory")
    public ResponseResult findAllResourceCategory(){
        List<ResourceCategory> allResourceCategory = resourceCategoryService.findAllResourceCategory();

        return  new ResponseResult(true,200,"查询所有分类信息成功",allResourceCategory);
    }

    @RequestMapping("/saveOrUpdateResourceCategory")
    public ResponseResult saveOrUpdateResourceCategory(@RequestBody ResourceCategory
                                                       resourceCategory, HttpSession session) {
        try {
            Integer user_id = (Integer) session.getAttribute("user_id");
            String username = userService.getUserNameById(user_id);
            if (resourceCategory.getId() == null) {
                Date date = new Date();
                resourceCategory.setCreatedTime(date);
                resourceCategory.setUpdatedTime(date);
                //这里设置当前登陆用户

                resourceCategory.setCreatedBy(username);
                resourceCategory.setUpdatedBy(username);
                resourceCategoryService.saveResourceCategory(resourceCategory);
                ResponseResult result = new ResponseResult(true, 200, "响应成功",
                        null);
                return result;
            } else {
                Date date = new Date();
                resourceCategory.setUpdatedTime(date);
                //这里设置当前登陆用户
                resourceCategory.setUpdatedBy(username);
                resourceCategoryService.updateResourceCategory(resourceCategory);
                ResponseResult result = new ResponseResult(true, 200, "响应成功",
                        null);
                return result;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @RequestMapping("/deleteResourceCategory")
    public ResponseResult deleteResourceCategory(Integer id){

        resourceCategoryService.deleteResourceCategory(id);
        ResponseResult responseResult = new ResponseResult(true, 200, "删除资源分类成功", null);
        return  responseResult;

    }


}
