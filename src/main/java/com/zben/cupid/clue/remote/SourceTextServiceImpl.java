package com.zben.cupid.clue.remote;

import com.zben.cupid.clue.service.CategoryService;
import com.zben.cupid.clue.api.SourceTextService;
import com.zben.cupid.clue.model.Categorys;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author: zben
 * @Description:
 * @Date: 上午11:33 2018/4/10
 */
public class SourceTextServiceImpl implements SourceTextService {

    @Autowired
    private CategoryService categoryService;

    public Categorys getByCode(String code) {
        if (StringUtils.isEmpty(code)) {
            return null;
        }
        Categorys category = categoryService.loadByCode(code, null);
        return category;
    }
}

































