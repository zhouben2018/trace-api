package com.zben.cupid.shield.service.impl;

import com.zben.cupid.shield.model.UserVo;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * @Author: zben
 * @Description:
 * @Date: 下午4:37 2018/4/11
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
@Slf4j
public class UserServiceImplTest {

    @Autowired
    private UserServiceImpl userService;

    @Test
    public void get() {
        UserVo userVo = userService.get("11");
        Assert.assertNotNull(userVo);
    }


    @Test
    public void getByAccountOrPhone() {
        String account = "zhouben";
        UserVo userVo = userService.getByAccountOrPhone(account);
        Assert.assertNotNull(userVo);
    }
}