package com.mediatracker.view;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LandingViewTest {
    @Test
    public void smoke() {
        String expected = LandingViewExpected.getInstance().getTitle();
        LandingView landingView = LandingView.getInstance("/");
        String actual = landingView.getTitle();
        landingView.closeDriver();

        assertEquals(actual, expected);
    }
}
