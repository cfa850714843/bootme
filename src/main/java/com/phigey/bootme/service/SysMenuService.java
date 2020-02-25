package com.phigey.bootme.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.phigey.bootme.dao.entity.SysMenuEntity;

import java.util.List;

/**
 * @author lizf
 */
public interface SysMenuService extends IService<SysMenuEntity> {


    /**
     * 根据角色查询用户权限
     * @Author Sans
     * @CreateTime 2019/6/19 10:14
     * @Param  roleId 角色ID
     * @Return List<SysMenuEntity> 权限集合
     */
    List<SysMenuEntity> selectSysMenuByRoleId(Long roleId);

}