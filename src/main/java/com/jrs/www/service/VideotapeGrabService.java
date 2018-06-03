package com.jrs.www.service;

import com.jrs.www.po.JrsMatchVideotape;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface VideotapeGrabService {

    void videotapeGrab(String url, int typeCode);

    List<JrsMatchVideotape> getVideotapeGrabByMatchTypeId(Integer matchTypeId);
}
