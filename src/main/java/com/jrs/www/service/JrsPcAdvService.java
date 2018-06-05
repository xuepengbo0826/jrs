package com.jrs.www.service;

import com.jrs.www.po.JrsPcAdv;

import java.util.List;

public interface JrsPcAdvService {

    List<JrsPcAdv> getJrsPcAdv(Integer positionId);

    void addJrsPcAdv(JrsPcAdv jrsPcAdv);
}
