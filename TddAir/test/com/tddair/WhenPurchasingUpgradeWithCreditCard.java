package com.tddair;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WhenPurchasingUpgradeWithCreditCard {
    public static final String VALID_CREDIT_CARD = "1111111111111111";
    public static final String INVALID_CREDIT_CARD = "0000000000000000";
    private TddAirApplication app;
    private Member redGuy;
    private Member greenguy;
    private SpyCas processor = new SpyCas();

    @Before
    public void given() {
        app = new TddAirApplication();
        app.registerMember("redguy", "redguy@improving.com");
//        app.registerMember("blueguy", "blueguy@improving.com");
//        app.registerMember("goldguy", "goldguy@improving.com");

        redGuy = app.lookupMember("redguy");
        redGuy.buyUpgradeWithValidCreditCard(1, VALID_CREDIT_CARD);

        app.registerMember("greenguy", "greenguy@improving.com");
        greenguy = app.lookupMember("greenguy");
    }

    @Test
    public void shouldCostRedGuyOneHundredDollars(){
        assertEquals(100, processor.getTotalCharged(VALID_CREDIT_CARD));
    }
}
