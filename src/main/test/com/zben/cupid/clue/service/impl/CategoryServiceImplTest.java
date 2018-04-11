package com.zben.cupid.clue.service.impl;

import com.zben.cupid.clue.model.Categorys;
import com.zben.cupid.clue.service.CategoryService;
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
 * @Date: 下午1:35 2018/4/10
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
@Slf4j
public class CategoryServiceImplTest {

    @Autowired
    private CategoryServiceImpl categoryService;

    @Test
    public void loadByCode() throws Exception {
        String code = "app";
        String parentCode = null;
        Categorys categorys = categoryService.loadByCode(code, parentCode);
        Assert.assertNotNull(categorys);
    }
}