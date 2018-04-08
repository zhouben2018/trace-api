package com.zben.cupid.trace.impl;


import com.zben.cupid.trace.api.ClueTraceService;
import com.zben.cupid.trace.dao.ClueTraceMysqlDao;
import com.zben.cupid.trace.model.ClueTrace;
import com.zben.cupid.trace.util.UUIDUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author: zben
 * @Description:
 * @Date: 上午9:51 2018/4/8
 */
@Slf4j
public class ClueTraceServiceImpl implements ClueTraceService {

    @Autowired
    private ClueTraceMysqlDao clueTraceMysqlDao;

    public void addClueTrace(String userId, String storeId, String operator, String key, Object value) {
        ClueTrace clueTrace = ClueTrace.builder().id(UUIDUtil.getId()).userId(userId)
                .storeId(storeId).operator(operator).key(key).value(value).build();
        try {
            clueTraceMysqlDao.saveDomain(clueTrace);
        } catch (Exception e) {
            log.error("【添加线索轨迹】失败 clueTrace={}", clueTrace);
        }
    }
}
