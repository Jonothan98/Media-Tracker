package com.mediatracker.view;

public class LandingViewExpected implements LandingViewCalibratable {
    public static LandingViewExpected getInstance() {
        return new LandingViewExpected();
    }

    @Override
    public String getTitle() {
        return "Welcome to Media Tracker";
    }
}
