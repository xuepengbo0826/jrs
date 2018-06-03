package com.jrs.www.enums;

public enum MatchTypeEnums {

    BASKETBALL(1, "篮球"),
    FOOTBALL(2, "足球");

    MatchTypeEnums(int code, String message){
        this.code = code;
        this.message = message;
    }

    private int code;

    private String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static String getMessageByCode(int code){
        MatchTypeEnums[] matchTypeEnums = MatchTypeEnums.values();
        for (MatchTypeEnums matchTypeEnum : matchTypeEnums) {
            if(matchTypeEnum.getCode() == code){
                return matchTypeEnum.getMessage();
            }
        }
        return null;
    }
}
