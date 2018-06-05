package com.jrs.www.controller;

import com.jrs.www.enums.BusnessExcpitonEnums;
import com.jrs.www.po.JrsMatchVideotape;
import com.jrs.www.service.JrsVideotapeGrabService;
import com.jrs.www.util.ResponseUtil;
import com.jrs.www.vo.ResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "videotape-grab")
public class JrsVideotapeGrabController {

    @Autowired
    private JrsVideotapeGrabService videotapeGrabService;

    @RequestMapping(value = "/videotape-grab/{matchTypeId}", method = RequestMethod.GET)
    public ResponseBody getVideotapeGrab(@PathVariable("matchTypeId") Integer matchTypeId){
        List<JrsMatchVideotape> jrsMatchVideotapeList = videotapeGrabService.getVideotapeGrabByMatchTypeId(Integer.valueOf(matchTypeId));
        return ResponseUtil.ResponseUtil(BusnessExcpitonEnums.SUCCESS.getCode(), BusnessExcpitonEnums.SUCCESS.getMessage(), jrsMatchVideotapeList);
    }
}
