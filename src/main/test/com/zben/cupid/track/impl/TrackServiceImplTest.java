package com.zben.cupid.track.impl;

import com.zben.cupid.trace.util.UUIDUtil;
import com.zben.cupid.track.model.Track;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * @Author: zben
 * @Description:
 * @Date: 上午11:03 2018/4/13
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
@Slf4j
public class TrackServiceImplTest {

    @Autowired
    private TrackServiceImpl trackService;

    @Test
    public void save() {
        Track track = new Track();
        track.setId(UUIDUtil.getId());
        track.setShopCode("12011");
        track.setType(5);
        track.setUserId("111111");
        try {
            trackService.save(track);
        } catch (Exception e) {
            log.error("[save] 错误");
        }
    }
}