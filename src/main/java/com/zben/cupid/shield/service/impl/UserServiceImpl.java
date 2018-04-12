package com.zben.cupid.shield.service.impl;

import com.zben.cupid.clue.model.CUser;
import com.zben.cupid.shield.api.UserService;
import com.zben.cupid.shield.manager.UserManager;
import com.zben.cupid.shield.model.UserVo;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author: zben
 * @Description:
 * @Date: 下午4:10 2018/4/11
 */
public class UserServiceImpl implements UserService {

    @Autowired
    private UserManager userManager;

    public UserVo get(String userId) {
        return userManager.get(userId);
    }

    public UserVo getByAccountOrPhone(String account) {
        UserVo userVo = userManager.getByAccount(account);
        if (userVo == null) {
            return userManager.getByPhone(account);
        }
        return userVo;
    }

    public CUser getCrmId(String id) {
        if (id == null) {
            return null;
        }
        return userManager.getByCrmId(id);
    }
}








































































