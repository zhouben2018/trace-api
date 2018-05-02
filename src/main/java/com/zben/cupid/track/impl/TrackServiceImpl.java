package com.zben.cupid.track.impl;

import com.zben.cupid.base.CustomerTrackException;
import com.zben.cupid.trace.util.UUIDUtil;
import com.zben.cupid.track.api.TrackService;
import com.zben.cupid.track.dao.TrackDao;
import com.zben.cupid.track.model.Track;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author: zben
 * @Description:
 * @Date: 上午10:47 2018/4/13
 */
public class TrackServiceImpl implements TrackService {

    @Autowired
    private TrackDao trackDao;

    public String save(Track track) {
        if (track == null) {
            throw new CustomerTrackException("track can't be null");
        }
        if (StringUtils.isEmpty(track.getUserId()) || StringUtils.isEmpty(track.getShopCode())) {
            throw new CustomerTrackException("shopCode or userId can't be null");
        }
        if (track.getType() == 0) {
            throw new CustomerTrackException("uncorrect type");
        }
        track.setId(UUIDUtil.getId());
        trackDao.save(track);
        return track.getId();
    }
}




































