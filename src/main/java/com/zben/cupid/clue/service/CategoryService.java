package com.zben.cupid.clue.service;

import com.zben.cupid.clue.model.Categorys;

/**
 * @Author: zben
 * @Description:
 * @Date: 上午11:46 2018/4/10
 */
public interface CategoryService {

    Categorys loadByCode(String secondCategoryCode, String topCategoryCode);
}
