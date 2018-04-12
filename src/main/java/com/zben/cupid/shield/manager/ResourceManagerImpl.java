package com.zben.cupid.shield.manager;

import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.zben.cupid.shield.dao.ResourceDao;
import com.zben.cupid.shield.model.ResourceVo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: zben
 * @Description:
 * @Date: 上午9:40 2018/4/12
 */
@Service
public class ResourceManagerImpl implements ResourceManager {

    @Autowired
    private ResourceDao resourceDao;

    public List<ResourceVo> getResourceByUserId(String userId, String shopCode) {
        Preconditions.checkArgument(StringUtils.isNotEmpty(userId), "userId can't be empty");
        Preconditions.checkArgument(StringUtils.isNotEmpty(shopCode), "shopCode can't be empty");

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("shopCode", shopCode);
        params.put("userId", userId);

        List<ResourceVo> resourceVoList = selectListByUserId(params);
        return resourceVoList;
    }

    private List<ResourceVo> selectListByUserId(Map<String, Object> params) {
        List<String> resourceIdList = new ArrayList<String>();
        resourceIdList.add("111111");
        resourceIdList.add("222222");
        String resourceIds = Joiner.on("','").join(resourceIdList);
        resourceIds = "'" + resourceIds + "'";
        params.put("resourceIds", resourceIds);
        return resourceDao.selectListByUserId(params);
    }


}
































