package com.zben.cupid.shield.service.impl;

import com.zben.cupid.shield.model.ResourceVo;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @Author: zben
 * @Description:
 * @Date: 下午2:30 2018/4/12
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
@Slf4j
public class ResourceServiceImplTest {

    @Autowired
    private ResourceServiceImpl resourceService;

    @Test
    public void getResourceByUserId() {
        String userId = "11";
        List<ResourceVo> resourceVoList = resourceService.getResourceByUserId(userId);
        Assert.assertNotEquals(0, resourceVoList.size());
    }
}