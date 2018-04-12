package com.zben.cupid.shield.service.impl;

import com.zben.cupid.shield.api.ResourceService;
import com.zben.cupid.shield.manager.ResourceManager;
import com.zben.cupid.shield.manager.UserManager;
import com.zben.cupid.shield.model.ResourceVo;
import com.zben.cupid.shield.model.UserVo;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zben
 * @Description:
 * @Date: 上午9:32 2018/4/12
 */
@Slf4j
public class ResourceServiceImpl implements ResourceService {

    @Autowired
    private UserManager userManager;
    @Autowired
    private ResourceManager resourceManager;

    public List<ResourceVo> getResourceByUserId(String userId) {
        UserVo userVo = userManager.get(userId);
        if (userVo == null) {
            log.error("用户不存在");
            return new ArrayList<ResourceVo>();
        }
        String shopCode = userVo.getShopCode();
        if (StringUtils.isBlank(shopCode)) {
            shopCode = "111";
        }
        List<ResourceVo> resourceVoList = resourceManager.getResourceByUserId(userId, shopCode);

        return resourceVoList;
    }
}

































