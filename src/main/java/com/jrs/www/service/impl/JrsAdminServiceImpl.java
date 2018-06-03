package com.jrs.www.service.impl;

import com.jrs.www.dao.JrsAdminMapper;
import com.jrs.www.po.JrsAdmin;
import com.jrs.www.service.JrsAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class JrsAdminServiceImpl implements JrsAdminService {

    @Autowired
    private JrsAdminMapper jrsAdminMapper;

    @Override
    public boolean login(JrsAdmin jrsAdmin) {
        List<JrsAdmin> jrsAdminList = jrsAdminMapper.selectByJrsAdmin(jrsAdmin);
        if(jrsAdminList.size() > 0){
            return true;
        }else{
            return false;
        }
    }

    @Override
    @Transactional
    public void insertJrsAdmin(JrsAdmin jrsAdmin) throws Exception {
        List<JrsAdmin> jrsAdminList = jrsAdminMapper.selectByJrsAdmin(jrsAdmin);
        if(jrsAdminList.size() > 0){
            throw new Exception();
        }else{
            jrsAdminMapper.insert(jrsAdmin);
        }
    }
}
