package com.jrs.www.enums;

public enum DeleteEunm {

    NOTDELETE("Y"),
    DELETE("N");

    DeleteEunm(String deleteStatus){
        this.deleteStatus = deleteStatus;
    }

    private String deleteStatus;

    public String getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(String deleteStatus) {
        this.deleteStatus = deleteStatus;
    }
}
