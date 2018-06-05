package com.jrs.www.service.impl;

import com.jrs.www.dao.JrsPcAdvPositionMapper;
import com.jrs.www.po.JrsPcAdvPosition;
import com.jrs.www.service.JrsPcAdvPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JrsPcAdvPositionServiceImpl implements JrsPcAdvPositionService {

    @Autowired
    private JrsPcAdvPositionMapper jrsPcAdvPositionMapper;

    @Override
    public List<JrsPcAdvPosition> getAll() {
        return jrsPcAdvPositionMapper.selectAll();
    }
}
