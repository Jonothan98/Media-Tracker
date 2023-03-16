package com.mediatracker.view;

public class LandingView extends TrackerView{

    public static final String RELATIVE_URI = "";
    public static final String LOCATOR_VALUE = "landing-title";

    public LandingView(String relativeUri) {
        super(RELATIVE_URI);
    }

    public static LandingView getInstance(String relativeUri) {
        return new LandingView(relativeUri);
    }

    public String getTitle() {
        return getElementById(LOCATOR_VALUE).getText();
    }
}
