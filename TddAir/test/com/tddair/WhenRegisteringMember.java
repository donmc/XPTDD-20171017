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
        String status = "Red";
        int ytdmiles = 0;
        int balancemiles = 10000;

        //execute
        app.registerMember(username, email, status, ytdmiles, balancemiles);

        //verify
        member = app.lookupMember(username);

    }

    // Should be registered
    @Test
    public void shouldBeRegistered(){
        assertNotNull(member);
    }
    // Should be Red status
    @Test
    public void shouldBeRedStatus(){
        String status=member.getStatus();
        assertEquals("Red",status);
    }
    // Should have 0 YTD miles
    @Test
    public void shouldHaveZeroYTDMiles(){
        int ytdmiles=member.getYtdmiles();
        assertEquals(0,ytdmiles);
    }
    @Test
    public void shouldHaveBalanceMiles(){
        int balmiles=member.getBalancemiles();
        assertEquals(10000,balmiles);
    }


    // Should have Correct username
    // Should have correct email

    // Should have 10000 bonus miles
}