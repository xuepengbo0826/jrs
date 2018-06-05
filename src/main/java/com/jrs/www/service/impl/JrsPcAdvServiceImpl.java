package com.jrs.www.service.impl;

import com.jrs.www.dao.JrsPcAdvMapper;
import com.jrs.www.po.JrsPcAdv;
import com.jrs.www.service.JrsPcAdvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JrsPcAdvServiceImpl implements JrsPcAdvService {

    @Autowired
    private JrsPcAdvMapper jrsPcAdvMapper;

    @Override
    public List<JrsPcAdv> getJrsPcAdv(Integer positionId) {
        return jrsPcAdvMapper.selectAllByPositionId(positionId);
    }

    @Override
    public void addJrsPcAdv(JrsPcAdv jrsPcAdv) {
        jrsPcAdvMapper.insert(jrsPcAdv);
    }
}
