package com.tddair;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class WhenRegisteringMember {

    private Member member;

    @Before
    public void Given(){
        //setup
        TddAirApplication app = new TddAirApplication();
        String username = "padminikal";
        String email = "padminikal@rediff.com";

        //execute
        app.registerMember(username, email);

        //verify
        member = app.lookupMember(username);

    }

    // Should be registered
    @Test
    public void shouldBeRegistered(){
        assertNotNull(member);
    }

    // Should have Correct username
    // Should have correct email
    // Should be Red status
    // Should have 0 YTD miles
    // Should have 10000 bonus miles
}