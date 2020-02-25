package com.phigey.bootme.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.phigey.bootme.dao.entity.SysMenuEntity;
import com.phigey.bootme.dao.mapper.SysMenuMapper;
import com.phigey.bootme.service.SysMenuService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lizf
 */
@Service("sysMenuService")
public class SysMenuServiceImpl extends ServiceImpl<SysMenuMapper, SysMenuEntity> implements SysMenuService {
    /**
     * 根据角色查询用户权限
     * @Author Sans
     * @CreateTime 2019/6/19 10:14
     * @Param  roleId 角色ID
     * @Return List<SysMenuEntity> 权限集合
     */
    @Override
    public List<SysMenuEntity> selectSysMenuByRoleId(Long roleId) {
        return this.baseMapper.selectSysMenuByRoleId(roleId);
    }
}
