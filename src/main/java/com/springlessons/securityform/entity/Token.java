package com.springlessons.securityform.entity;

import java.time.LocalDateTime;

public class Token {
    private String token;
    private String refreshToken;


    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }
}
