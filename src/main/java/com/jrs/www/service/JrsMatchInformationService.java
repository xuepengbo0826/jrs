package com.jrs.www.service;

import com.jrs.www.po.JrsMatchInformation;

import java.util.List;

public interface JrsMatchInformationService {

    List<JrsMatchInformation> selectAll();
}
