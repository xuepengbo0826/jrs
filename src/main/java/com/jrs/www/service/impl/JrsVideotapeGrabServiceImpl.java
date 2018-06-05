package com.jrs.www.service.impl;

import com.jrs.www.dao.JrsMatchVideotapeMapper;
import com.jrs.www.enums.MatchTypeEnums;
import com.jrs.www.po.JrsMatchVideotape;
import com.jrs.www.service.JrsVideotapeGrabService;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
视频录像
 */
@Service
public class JrsVideotapeGrabServiceImpl implements JrsVideotapeGrabService {

    @Autowired
    private JrsMatchVideotapeMapper jrsMatchVideotapeMapper;

    @Override
    public void videotapeGrab(String url, int typeCode) {
        List<JrsMatchVideotape> selectJrsMatchVideotapeList = jrsMatchVideotapeMapper.selectAllByType(typeCode);
        try {
            Document doc = Jsoup.connect(url).get();
            Element element = doc.select("tbody.video-list-table").first();
            Elements trs = element.getElementsByTag("tr");
            List<JrsMatchVideotape> jrsMatchVideotapeList = new ArrayList<>();
            for (Element tr : trs) {
                Elements divTeamNames = tr.select("div.team-name");
                String matchTime = tr.select("td.video-times").html();
                String matchName = tr.select("td.video-matchname").html();
                boolean isSame = false;
                if(selectJrsMatchVideotapeList.size() > 0){
                    for (JrsMatchVideotape jrsMatchVideotape : selectJrsMatchVideotapeList) {
                        if(!(jrsMatchVideotape.getHomeTeam().equalsIgnoreCase(divTeamNames.get(0).html()) &&
                                jrsMatchVideotape.getOffTeam().equalsIgnoreCase(divTeamNames.get(1).html()) &&
                                jrsMatchVideotape.getLeagueMatch().equalsIgnoreCase(matchName) &&
                                jrsMatchVideotape.getMatchTime().equalsIgnoreCase(matchTime))){
                            isSame = true;
                            break;
                        }
                    }
                    if(!isSame){
                        JrsMatchVideotape insertJrsMatchVideotape = comparison(tr, typeCode);
                        jrsMatchVideotapeList.add(insertJrsMatchVideotape);
                    }
                }else{
                    JrsMatchVideotape insertJrsMatchVideotape = comparison(tr, typeCode);
                    jrsMatchVideotapeList.add(insertJrsMatchVideotape);
                }
            }
            if(jrsMatchVideotapeList.size() > 0){
                jrsMatchVideotapeMapper.insertList(jrsMatchVideotapeList);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<JrsMatchVideotape> getVideotapeGrabByMatchTypeId(Integer matchTypeId) {
        return jrsMatchVideotapeMapper.selectAllByType(matchTypeId);
    }

    private JrsMatchVideotape comparison(Element tr, int typeCode){
        Elements divTeamNames = tr.select("div.team-name");
        String matchTime = tr.select("td.video-times").html();
        String matchName = tr.select("td.video-matchname").html();
        Elements divTeamLogs = tr.select("div.team-logo");
        JrsMatchVideotape jrsMatchVideotape = new JrsMatchVideotape();
        jrsMatchVideotape.setMatchTypeId(typeCode);
        jrsMatchVideotape.setMatchType(MatchTypeEnums.getMessageByCode(typeCode));
        jrsMatchVideotape.setHomeTeam(divTeamNames.get(0).html());
        jrsMatchVideotape.setHomeTeamLog(divTeamLogs.get(0).select("img").attr("src"));
        jrsMatchVideotape.setLeagueMatch(matchName);
        jrsMatchVideotape.setOffTeam(divTeamNames.get(1).html());
        jrsMatchVideotape.setOffTeamLog(divTeamLogs.get(1).select("img").attr("src"));
        jrsMatchVideotape.setMatchTime(matchTime);
        jrsMatchVideotape.setScore(tr.select("div.vs").html());
        return jrsMatchVideotape;
    }
}
