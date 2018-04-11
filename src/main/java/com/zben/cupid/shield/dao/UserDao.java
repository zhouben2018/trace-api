package com.zben.cupid.shield.dao;

import com.zben.cupid.shield.model.UserVo;

/**
 * @Author: zben
 * @Description:
 * @Date: 下午4:22 2018/4/11
 */
public interface UserDao {
    /**
     * 根据ID获取,只能取大风车用户
     * @param userId
     * @return
     */
    UserVo selectOne(String userId);
}
