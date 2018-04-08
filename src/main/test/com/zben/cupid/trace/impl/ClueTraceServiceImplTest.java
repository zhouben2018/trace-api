package com.zben.cupid.trace.impl;

import com.zben.cupid.trace.api.ClueTraceService;
import com.zben.cupid.trace.dao.ClueTraceMysqlDao;
import com.zben.cupid.trace.model.ClueTrace;
import com.zben.cupid.trace.util.UUIDUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * @Author: zben
 * @Description:
 * @Date: 上午10:18 2018/4/8
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
@Slf4j
public class ClueTraceServiceImplTest {

    @Autowired
    private ClueTraceMysqlDao clueTraceMysqlDao;

    @Autowired
    private ClueTraceServiceImpl clueTraceService;

    @Test
    public void addClueTrace() {
        ClueTrace clueTrace = ClueTrace.builder().id(UUIDUtil.getId()).userId("1")
                .storeId("2").operator("3").key("isFiltered").value(0).build();
        try {
            clueTraceMysqlDao.saveDomain(clueTrace);
        } catch (Exception e) {
            log.error("【线索保存】错误 clueTrace={}", clueTrace);
        }
    }

    @Test
    public void addClueTrace2() {
        try {
            clueTraceService.addClueTrace("1", "2", "3", "4", "5");
        } catch (Exception e) {
            log.error("【线索保存】错误 clueTrace");
        }
    }
}