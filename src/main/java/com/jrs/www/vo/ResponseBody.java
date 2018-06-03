package com.jrs.www.vo;

public class ResponseBody {

    private String code;

    private String message;

    private Object object;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public ResponseBody(String code, String message, Object object) {
        this.code = code;
        this.message = message;
        this.object = object;
    }
}
