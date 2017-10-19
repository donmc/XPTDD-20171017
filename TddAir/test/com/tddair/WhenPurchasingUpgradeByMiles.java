package com.tddair;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WhenPurchasingUpgradeByMiles {
    private TddAirApplication app;
    private Member member;

    @Before
    public void given() {
        app = new TddAirApplication();
        app.registerMember("redguy", "redguy@improving.com");
//        app.registerMember("blueguy", "blueguy@improving.com");
//        app.registerMember("goldguy", "goldguy@improving.com");

        member = app.lookupMember("redguy");
        member.buyUpgradeWithMiles(1);
//        app.completeFlight("redguy", "QF191");
//
        app.addFlight("WWW", "SSS", 30000, "TS", 30000);
//        app.addFlight("WWW", "SSS", 50000, "TS", 50000);
    }

    @Test
    public void shouldLeaveRedGuyWithZeroBalance() {
        assertEquals(0, member.getBalanceMiles());
    }
    @Test
    public void shouldGiveRedGuyOneSeatUpgrade(){
        assertEquals(1, member.getSeatUpgrades());
    }

    @Test
    public void shouldLeaveGreenGuyWithThirtyOneThousandMiles() {
        app.registerMember("greenguy", "greenguy@improving.com");
        member = app.lookupMember("greenguy");
        member.completeFlight(app.getFlightByNumber("TS30000"));
        member.buyUpgradeWithMiles(1);
        assertEquals(31000, member.getBalanceMiles());
    }
}

