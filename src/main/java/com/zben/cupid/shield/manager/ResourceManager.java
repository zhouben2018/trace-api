package com.zben.cupid.shield.manager;

import com.zben.cupid.shield.model.ResourceVo;

import java.util.List;

/**
 * @Author: zben
 * @Description:
 * @Date: 上午9:39 2018/4/12
 */
public interface ResourceManager {
    List<ResourceVo> getResourceByUserId(String userId, String shopCode);
}
