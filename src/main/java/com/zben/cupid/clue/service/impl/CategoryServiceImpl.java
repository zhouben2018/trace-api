package com.zben.cupid.clue.service.impl;

import com.zben.cupid.clue.dao.CategoryDao;
import com.zben.cupid.clue.model.Categorys;
import com.zben.cupid.clue.service.CategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: zben
 * @Description:
 * @Date: 上午11:55 2018/4/10
 */
@Service
@Slf4j
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryDao categoryDao;

    public Categorys loadByCode(String secondCategoryCode, String topCategoryCode) {
        Categorys category = null;
        Map map = new HashMap();
        try {
            map.put("code", secondCategoryCode);
            map.put("parentCode", topCategoryCode);
            category = categoryDao.findByCode(map);
        } catch (Exception e) {
            log.error("【】category={}", category);
            e.printStackTrace();
        }
        return category;
    }
}
