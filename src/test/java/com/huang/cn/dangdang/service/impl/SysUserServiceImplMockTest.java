package com.huang.cn.dangdang.service.impl;

import base.ServiceMockTestBase;
import com.huang.cn.dangdang.dao.SysUserDao;
import com.huang.cn.dangdang.entity.SysUser;
import com.huang.cn.dangdang.service.SysUserService;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

/**
 * @Author: Derek.huang on 2023/5/28 20:05.
 */
public class SysUserServiceImplMockTest extends ServiceMockTestBase {

    @InjectMocks
    private SysUserServiceImpl sysUserService;

    @Mock
    private SysUserDao sysUserDao;

    @Test
    public void should_result_success_when_selectUser() {

        SysUser sysUser = new SysUser();
        sysUser.setUserId("888");
        sysUser.setLoginName("derek.huang");

        when(sysUserDao.queryById(any())).thenReturn(sysUser);

        SysUser user = sysUserService.queryById("888");
        Assert.assertEquals("derek.huang", user.getLoginName());
        verify(sysUserDao, times(1)).queryById(any());

    }
}
