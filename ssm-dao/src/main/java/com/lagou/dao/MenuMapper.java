package com.lagou.dao;

import com.lagou.domain.Menu;

import java.util.List;

public interface MenuMapper {

    /*
        查询所有子菜单信息
     */

    public List<Menu> findSubMenuListByPid(int pid);

    /*
        查询所有菜单列表  (菜单列表查询 直接查询所有)
     */
    public List<Menu> findAllMenu();


    Menu findMenuById(Integer id);
}
