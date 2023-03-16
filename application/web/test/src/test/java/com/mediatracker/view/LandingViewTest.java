package com.mediatracker.view;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LandingViewTest {
    @Test
    public void smoke(){
        String expected = LandingViewExpected.getInstance().getTitle();
        String actual = LandingView.getInstance("/").getTitle();
        assertEquals(actual,expected);
    }
}
