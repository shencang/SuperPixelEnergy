package com.shencangblue.jin.superpixelenergy.bean;

import com.google.gson.annotations.SerializedName;



public class LoginBean {
    @SerializedName("status")
    private String status;

    // TODO 额外添加
    private String cookie;

    public String getStatus() {
        return status;
    }

    public boolean isStatusOk() {
        return "ok".equals(status);
    }

    public boolean isStatusErrPwd() {
        return "password_error".equals(status);
    }

    public void setCookie(String cookie) {
        this.cookie = cookie;
    }

    public String getCookie() {
        return cookie;
    }
}
