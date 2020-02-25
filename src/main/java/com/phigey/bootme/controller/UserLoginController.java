package com.phigey.bootme.controller;

import com.phigey.bootme.dao.entity.SysUserEntity;
import com.phigey.bootme.dao.entity.SysUserRoleEntity;
import com.phigey.bootme.service.SysUserRoleService;
import com.phigey.bootme.service.SysUserService;
import com.phigey.bootme.util.SHA256Util;
import com.phigey.bootme.util.ShiroUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;

/**
 * @author lizf
 */
@RestController
@RequestMapping(path = "user")
public class UserLoginController {

    @Autowired
    private SysUserService sysUserService;
    @Autowired
    private SysUserRoleService sysUserRoleService;

    /**
     * 登录
     *
     */
    @PostMapping(path = "/login")
    public Map<String, Object> login(@RequestBody @Validated SysUserEntity sysUserEntity){
        Map<String, Object> map = new HashMap<>();
        //进行身份验证
        try{
            //验证身份和登陆
            Subject subject = SecurityUtils.getSubject();
            UsernamePasswordToken token = new UsernamePasswordToken(sysUserEntity.getUsername(), sysUserEntity.getPassword());
            //进行登录操作
            subject.login(token);
        }catch (IncorrectCredentialsException e) {
            map.put("code", 500);
            map.put("msg", "用户不存在或者密码错误");
            return map;
        } catch (LockedAccountException e) {
            map.put("code", 500);
            map.put("msg", "登录失败，该用户已被冻结");
            return map;
        } catch (AuthenticationException e) {
            map.put("code", 500);
            map.put("msg", "该用户不存在");
            return map;
        } catch (Exception e) {
            map.put("code",500);
            map.put("msg","未知异常");
            return map;
        }
        map.put("code", 0);
        map.put("msg", "登录成功");
        map.put("token", ShiroUtils.getSession().getId().toString());
        return map;
    }
    /**
     *
     * 未登录
     */
    @GetMapping("/unauth")
    public Map<String, Object> unauth(){
        Map<String, Object> map = new HashMap<>();
        map.put("code", 500);
        map.put("msg", "未登录");
        return map;
    }


    /**
     *
     * 添加一个用户演示接口
     * 这里仅作为演示不加任何权限和重复查询校验
     */
    @GetMapping("/testAddUser")
    public Map<String, Object> testAddUser(){
        // 设置基础参数
        SysUserEntity sysUser = new SysUserEntity();
        sysUser.setUsername("user1");
        sysUser.setState("NORMAL");
        // 随机生成盐值
        String salt = RandomStringUtils.randomAlphanumeric(20);
        sysUser.setSalt(salt);
        // 进行加密
        String password ="123456";
        sysUser.setPassword(SHA256Util.sha256(password, sysUser.getSalt()));
        // 保存用户
        sysUserService.save(sysUser);
        // 保存角色
        SysUserRoleEntity sysUserRoleEntity = new SysUserRoleEntity();
        // 保存用户完之后会把ID返回给用户实体
        sysUserRoleEntity.setUserId(sysUser.getUserId());
        sysUserRoleService.save(sysUserRoleEntity);
        // 返回结果
        Map<String, Object> map = new HashMap<>();
        map.put("code", 0);
        map.put("msg", "添加成功");
        return map;
    }
}
