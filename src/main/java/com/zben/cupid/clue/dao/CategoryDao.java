package com.zben.cupid.clue.dao;

import com.zben.cupid.clue.model.Categorys;

import java.util.Map;

/**
 * @Author: zben
 * @Description:
 * @Date: 上午11:57 2018/4/10
 */
public interface CategoryDao {
    Categorys findByCode(Map map);
}
