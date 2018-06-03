package com.jrs.www.service.impl;

import com.jrs.www.service.LiveGrabService;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class LiveGrabServiceImpl implements LiveGrabService {

    @Override
    public void liveGrab(String url) {
        try {
            Document doc = Jsoup.connect(url).get();
            Element element = doc.select("tbody.video-list-table").first();
            Elements trs = element.getElementsByTag("tr");
            for (Element tr : trs) {
                System.out.println(tr.html());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
