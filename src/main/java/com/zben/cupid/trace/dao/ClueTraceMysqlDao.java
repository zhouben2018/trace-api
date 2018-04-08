package com.zben.cupid.trace.dao;

import com.zben.cupid.trace.model.ClueTrace;

/**
 * @Author: zben
 * @Description:
 * @Date: 上午10:01 2018/4/8
 */
public interface ClueTraceMysqlDao {

    void saveDomain(ClueTrace clueTrace);
}
