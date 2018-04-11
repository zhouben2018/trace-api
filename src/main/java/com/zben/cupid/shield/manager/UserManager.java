package com.zben.cupid.shield.manager;

import com.zben.cupid.shield.model.UserVo;

/**
 * @Author: zben
 * @Description:
 * @Date: 下午4:12 2018/4/11
 */
public interface UserManager {

    /**
     * 查询用户信息
     * @param userId
     * @return
     */
    UserVo get(String userId);

    UserVo getByAccount(String account);

    UserVo getByPhone(String phone);
}
