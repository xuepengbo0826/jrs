package com.jrs.www.service.impl;

import com.jrs.www.dao.JrsMatchTypeMapper;
import com.jrs.www.po.JrsMatchType;
import com.jrs.www.service.JrsMatchTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JrsMatchTypeServiceImpl implements JrsMatchTypeService {

    @Autowired
    private JrsMatchTypeMapper jrsMatchTypeMapper;

    @Override
    public List<JrsMatchType> getJrsMatchTypeList() {
        return jrsMatchTypeMapper.selectAll();
    }
}
