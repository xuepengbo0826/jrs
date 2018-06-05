package com.jrs.www.controller;

import com.jrs.www.enums.BusnessExcpitonEnums;
import com.jrs.www.po.JrsPcAdvPosition;
import com.jrs.www.service.JrsPcAdvPositionService;
import com.jrs.www.util.ResponseUtil;
import com.jrs.www.vo.ResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "pc-adv-position")
public class JrsPcAdvPositionController {

    @Autowired
    private JrsPcAdvPositionService jrsPcAdvPositionService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ResponseBody getAllPcAdvPosition(){
        List<JrsPcAdvPosition> jrsPcAdvPositionList = jrsPcAdvPositionService.getAll();
        return ResponseUtil.ResponseUtil(BusnessExcpitonEnums.SUCCESS.getCode(), BusnessExcpitonEnums.SUCCESS.getMessage(), jrsPcAdvPositionList);
    }
}
