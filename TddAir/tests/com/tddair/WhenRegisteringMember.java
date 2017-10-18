package com.tddair;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by John_Krauskopf on 10/18/2017.
 */
public class WhenRegisteringMember {

    private Member member;

    @Before
    public void given () {
        //setup
        TddAirApplication app = new TddAirApplication();
        String username = "donmc";
        String email = "don@improving.com";

        //execute
        app.registerMember(username, email);

        //verify
        member = app.lookupMember(username);
    }

    @Test
    public void shouldBeRegistered() {
        assertNotNull(member);
    }

    // shouldHaveCorrectUsername
    @Test
    public void shouldHaveCorrectUsername() {
        assertEquals("donmc", member.getUsername());
    }

    // shouldHaveCorrectEmail
    //shouldHaveRedStatus
    //ShouldHave0YTDMiles
    //shouldHave10000BalanceMiles
}