package com.jrs.www.controller;

import com.jrs.www.enums.BusnessExcpitonEnums;
import com.jrs.www.po.JrsPcAdv;
import com.jrs.www.service.JrsPcAdvService;
import com.jrs.www.util.ResponseUtil;
import com.jrs.www.vo.ResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "pc-adv")
public class JrsPcAdvController {

    @Autowired
    private JrsPcAdvService jrsPcAdvService;

    @RequestMapping(value = "adv/{positionId}", method = RequestMethod.GET)
    public ResponseBody getJrsPcAdv(@PathVariable Integer positionId){
        List<JrsPcAdv> jrsPcAdvList = jrsPcAdvService.getJrsPcAdv(positionId);
        return ResponseUtil.ResponseUtil(BusnessExcpitonEnums.SUCCESS.getCode(), BusnessExcpitonEnums.SUCCESS.getMessage(), jrsPcAdvList);
    }

    @RequestMapping(value = "adv", method = RequestMethod.POST)
    public ResponseBody addJrsPcAdv(JrsPcAdv jrsPcAdv){
        jrsPcAdvService.addJrsPcAdv(jrsPcAdv);
        return ResponseUtil.ResponseUtil(BusnessExcpitonEnums.SUCCESS.getCode(), BusnessExcpitonEnums.SUCCESS.getMessage(), true);
    }
}
