package com.huang.cn.dangdang.service.impl;

import com.huang.cn.dangdang.entity.SysUser;
import com.huang.cn.dangdang.service.SysUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @Author: Derek.huang on 2023/5/28 19:36.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SysUserServiceImplTest {

    @Resource
    private SysUserService sysUserService;

    @Test
    public void should_result_success_when_selectUser(){

        SysUser sysUser = sysUserService.queryById("888");
        System.out.println(sysUser);
    }


}