package com.tddair;

import java.util.HashMap;
import java.util.Map;

public class Member {

    private String username;
    private String email;
    private String status;
    private int ytdmiles;
    private int balancemiles;

    public Member() {
    }

    public Member(String username, String email, String status, int ytdmiles, int balancemiles) {
        this.username = username;
        this.email = email;
        this.status = status;
        this.ytdmiles = ytdmiles;
        this.balancemiles = balancemiles;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getYtdmiles() {
        return ytdmiles;
    }

    public void setYtdmiles(int ytdmiles) {
        this.ytdmiles = ytdmiles;
    }

    public int getBalancemiles() {
        return balancemiles;
    }

    public void setBalancemiles(int balancemiles) {
        this.balancemiles = balancemiles;
    }
}
