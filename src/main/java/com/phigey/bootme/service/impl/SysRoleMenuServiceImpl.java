package com.phigey.bootme.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.phigey.bootme.dao.entity.SysRoleMenuEntity;
import com.phigey.bootme.dao.mapper.SysRoleMenuMapper;
import com.phigey.bootme.service.SysRoleMenuService;
import org.springframework.stereotype.Service;

/**
 * @author lizf
 */
@Service("sysRoleMenuService")
public class SysRoleMenuServiceImpl extends ServiceImpl<SysRoleMenuMapper, SysRoleMenuEntity> implements SysRoleMenuService {

}
