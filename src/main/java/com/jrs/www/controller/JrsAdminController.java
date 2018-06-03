package com.jrs.www.controller;

import com.jrs.www.enums.BusnessExcpitonEnums;
import com.jrs.www.po.JrsAdmin;
import com.jrs.www.service.JrsAdminService;
import com.jrs.www.util.MD5;
import com.jrs.www.util.ResponseUtil;
import com.jrs.www.vo.ResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "admin")
public class JrsAdminController {

    @Autowired
    private JrsAdminService jrsAdminService;

    @RequestMapping(value = "admin/login", method = RequestMethod.GET)
    public ResponseBody login(@RequestParam("userName") String userName, @RequestParam("passWord") String passWord){
        String salt = MD5.MD5(userName);
        JrsAdmin jrsAdmin = new JrsAdmin();
        jrsAdmin.setAdminName(userName);
        jrsAdmin.setAdminSalt(salt);
        jrsAdmin.setAdminPassword(MD5.MD5(salt + passWord));
        boolean bool = jrsAdminService.login(jrsAdmin);
        return ResponseUtil.ResponseUtil(BusnessExcpitonEnums.SUCCESS.getCode(), BusnessExcpitonEnums.SUCCESS.getMessage(), bool);
    }

    @RequestMapping(value = "admin", method = RequestMethod.POST)
    public ResponseBody addJrsAdmin(@RequestParam("userName") String userName, @RequestParam("passWord") String passWord){
        String salt = MD5.MD5(userName);
        JrsAdmin jrsAdmin = new JrsAdmin();
        jrsAdmin.setAdminName(userName);
        jrsAdmin.setAdminSalt(salt);
        jrsAdmin.setAdminPassword(MD5.MD5(salt + passWord));
        try {
            jrsAdminService.insertJrsAdmin(jrsAdmin);
        } catch (Exception e) {
            return ResponseUtil.ResponseUtil(BusnessExcpitonEnums.DATASAME.getCode(), BusnessExcpitonEnums.DATASAME.getMessage(), false);
        }
        return ResponseUtil.ResponseUtil(BusnessExcpitonEnums.SUCCESS.getCode(), BusnessExcpitonEnums.SUCCESS.getMessage(), true);
    }
}
