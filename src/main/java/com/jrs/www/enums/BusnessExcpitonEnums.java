package com.jrs.www.enums;

public enum BusnessExcpitonEnums {

    SUCCESS("0", "成功"),
    ERROR("1", "失败"),
    DATASAME("2", "数据相同");

    BusnessExcpitonEnums(String code, String message){
        this.code = code;
        this.message = message;
    }

    private String code;

    private String message;

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
}
