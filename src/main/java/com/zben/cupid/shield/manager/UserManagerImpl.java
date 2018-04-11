package com.zben.cupid.shield.manager;

import com.zben.cupid.shield.dao.UserDao;
import com.zben.cupid.shield.model.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: zben
 * @Description:
 * @Date: 下午4:21 2018/4/11
 */
@Service
public class UserManagerImpl implements UserManager {

    @Autowired
    private UserDao userDao;

    public UserVo get(String userId) {
        return userDao.selectOne(userId);
    }

    public UserVo getByAccount(String account) {
        return userDao.selectByAccount(account);
    }

    public UserVo getByPhone(String phone) {
        return userDao.selectByPhone(phone);
    }
}
