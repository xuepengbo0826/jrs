package com.jrs.www.controller;

import com.jrs.www.enums.BusnessExcpitonEnums;
import com.jrs.www.po.JrsMatchInformation;
import com.jrs.www.service.JrsMatchInformationService;
import com.jrs.www.util.ResponseUtil;
import com.jrs.www.vo.ResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "match-information")
public class JrsMatchInformationController {

    @Autowired
    private JrsMatchInformationService jrsMatchInformationService;

    @RequestMapping(value = "/match-information", method = RequestMethod.GET)
    public ResponseBody getAllJrsMatchInformation(){
        List<JrsMatchInformation> jrsMatchInformationList = jrsMatchInformationService.selectAll();
        return ResponseUtil.ResponseUtil(BusnessExcpitonEnums.SUCCESS.getCode(), BusnessExcpitonEnums.SUCCESS.getMessage(), jrsMatchInformationList);
    }
}
