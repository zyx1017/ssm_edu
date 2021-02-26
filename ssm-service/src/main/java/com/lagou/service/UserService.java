package com.lagou.service;

import com.github.pagehelper.PageInfo;
import com.lagou.domain.ResponseResult;
import com.lagou.domain.Role;
import com.lagou.domain.User;
import com.lagou.domain.UserVo;

import java.util.List;

public interface UserService {
    /*
            用户分页&多条件组合查询
         */
    PageInfo findAllUserByPage(UserVo userVo);

    void updateUserStatus(int id, String status);

    /*
            用户登陆
         */
    User login(User user) throws Exception;

    /*
            分配角色（回显）
         */
    List<Role> findUserRelationRoleById(Integer id);

    void userContextRole(UserVo userVo);

    /*
            获取用户权限信息
         */
    ResponseResult getUserPermissions(Integer userid);

    //根据用户ID返回用户名
    String getUserNameById(Integer id);
}
