package com.jrs.www.scheduled;

import com.jrs.www.enums.MatchTypeEnums;
import com.jrs.www.service.LiveGrabService;
import com.jrs.www.service.VideotapeGrabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class PullOutScheduled {

    @Autowired
    private VideotapeGrabService videotapeGrabService;

    @Autowired
    private LiveGrabService liveGrabService;

    @Scheduled(cron = "0 0/10 * * * ? ")
    public void liveGrab(){
        liveGrabService.liveGrab("http://leqiuba.cc/zhibo/");
    }

    @Scheduled(cron = "0 0/10 * * * ? ")
    public void videotapeGrabBasketball(){
        videotapeGrabService.videotapeGrab("http://www.leqiuba.cc/luxiang/lanqiu/", MatchTypeEnums.BASKETBALL.getCode());
    }

    @Scheduled(cron = "0 0/10 * * * ? ")
    public void videotapeGrabFootball(){
        videotapeGrabService.videotapeGrab("http://www.leqiuba.cc/luxiang/zuqiu/", MatchTypeEnums.FOOTBALL.getCode());
    }
}
