package com.tddair;

import java.util.HashMap;
import java.util.Map;

public class Member {

    private String username;
    private String email;

    public Member() {
    }

    public Member(String username, String email) {
        this.username = username;
        this.email = email;

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
}
