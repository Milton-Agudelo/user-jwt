package org.ada.school.controller.auth;

import java.util.Date;

public class TokenDto {
    private String token;
    private Date expirationDate;

    public TokenDto(String token, Date expirationDate) {
        this.token = token;
        this.expirationDate = expirationDate;
    }

    public String getToken() {
        return token;
    }

    /*public void setToken(String token) {
        this.token = token;
    }// */

    public Date getDate() {
        return expirationDate;
    }

    /*public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }// */
}
