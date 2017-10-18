package com.tddair;

/**
 * Created by John_Krauskopf on 10/18/2017.
 */
public class Member {
    String username;
    String email;

    public Member(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

}
