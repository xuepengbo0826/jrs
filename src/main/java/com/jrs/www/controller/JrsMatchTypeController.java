package com.jrs.www.controller;

import com.jrs.www.enums.BusnessExcpitonEnums;
import com.jrs.www.po.JrsMatchType;
import com.jrs.www.service.JrsMatchTypeService;
import com.jrs.www.util.ResponseUtil;
import com.jrs.www.vo.ResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "match-type")
public class JrsMatchTypeController {

    @Autowired
    private JrsMatchTypeService jrsMatchTypeService;

    @RequestMapping(value = "match-type/all", method = RequestMethod.GET)
    public ResponseBody getJrsMatchType(){
        List<JrsMatchType> jrsMatchTypeList = jrsMatchTypeService.getJrsMatchTypeList();
        return ResponseUtil.ResponseUtil(BusnessExcpitonEnums.SUCCESS.getCode(), BusnessExcpitonEnums.SUCCESS.getMessage(), jrsMatchTypeList);
    }

}
