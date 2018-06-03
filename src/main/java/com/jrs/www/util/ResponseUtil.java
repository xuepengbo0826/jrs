package com.jrs.www.util;

import com.jrs.www.vo.ResponseBody;

public class ResponseUtil {

    public static ResponseBody ResponseUtil(String code, String message, Object object) {
        return new ResponseBody(code, message, object);
    }
}
