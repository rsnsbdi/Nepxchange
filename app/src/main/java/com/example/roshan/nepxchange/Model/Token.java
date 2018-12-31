package com.example.roshan.nepxchange.Model;

public class Token {


    private String token_type;
    private String access_token;
    private String refresh_token;
    private String error;
    private String mobile;
    private String verified;
    private int facebook;

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getToken_type() {
        return token_type;
    }

    public void setToken_type(String token_type) {
        this.token_type = token_type;
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getRefresh_token() {
        return refresh_token;
    }

    public void setRefresh_token(String refresh_token) {
        this.refresh_token = refresh_token;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getVerified() {
        return verified;
    }

    public void setVerified(String verified) {
        this.verified = verified;
    }
    public int getFacebook() {
        return facebook;
    }

    public void setFacebook(Integer facebook) {
        this.facebook = facebook;
    }


}
