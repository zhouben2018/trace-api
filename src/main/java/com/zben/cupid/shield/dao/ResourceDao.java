package com.zben.cupid.shield.dao;

import com.zben.cupid.shield.model.ResourceVo;

import java.util.List;
import java.util.Map; /**
 * @Author: zben
 * @Description:
 * @Date: 上午9:52 2018/4/12
 */
public interface ResourceDao {

    /**
     * 根据用户ID下查询有效的
     * @param params
     * @return
     */
    List<ResourceVo> selectListByUserId(Map<String, Object> params);
}
