package com.tddair;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WhenPurchasingUpgradeByMiles {
    private TddAirApplication app;
    private Member redGuy;
    private Member greenguy;

    @Before
    public void given() {
        app = new TddAirApplication();
        app.registerMember("redguy", "redguy@improving.com");
//        app.registerMember("blueguy", "blueguy@improving.com");
//        app.registerMember("goldguy", "goldguy@improving.com");

        redGuy = app.lookupMember("redguy");
        redGuy.buyUpgradeWithMiles(1);

        app.registerMember("greenguy", "greenguy@improving.com");
        greenguy = app.lookupMember("greenguy");
        app.addFlight("WWW", "SSS", 30000, "TS", 30000);
        greenguy.completeFlight(app.getFlightByNumber("TS30000"));
        //app.completeFlight("redguy", "QF191");
//
//        app.addFlight("WWW", "SSS", 50000, "TS", 50000);
    }

    @Test
    public void shouldLeaveRedGuyWithZeroBalance() {
        assertEquals(0, redGuy.getBalanceMiles());
    }

    @Test
    public void shouldGiveRedGuyOneSeatUpgrade() {
        assertEquals(1, redGuy.getSeatUpgrades());
    }

    @Test
    public void shouldLeaveGreenGuyWithThirtyOneThousandMiles() {
        greenguy.buyUpgradeWithMiles(1);
        assertEquals(31000, greenguy.getBalanceMiles());
    }
}

