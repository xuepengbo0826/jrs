package com.jrs.www.service.impl;

import com.jrs.www.dao.JrsMatchInformationMapper;
import com.jrs.www.po.JrsMatchInformation;
import com.jrs.www.service.JrsMatchInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JrsMatchInformationServiceImpl implements JrsMatchInformationService {

    @Autowired
    private JrsMatchInformationMapper jrsMatchInformationMapper;

    @Override
    public List<JrsMatchInformation> selectAll() {
        return jrsMatchInformationMapper.selectAll();
    }
}
