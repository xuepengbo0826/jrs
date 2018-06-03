package com.jrs.www.service;

import com.jrs.www.po.JrsAdmin;

public interface JrsAdminService {

    boolean login(JrsAdmin jrsAdmin);

    void insertJrsAdmin(JrsAdmin jrsAdmin) throws Exception;
}
