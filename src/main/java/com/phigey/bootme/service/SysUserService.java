package com.phigey.bootme.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.phigey.bootme.dao.entity.SysUserEntity;

/**
 * @author lizf
 */
public interface SysUserService extends IService<SysUserEntity> {

    /**
     * 根据用户名查询实体
     *
     * @Param  username 用户名
     * @Return SysUserEntity 用户实体
     */
    SysUserEntity selectUserByName(String username);

}
