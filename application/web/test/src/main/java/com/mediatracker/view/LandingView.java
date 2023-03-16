package com.mediatracker.view;

import org.openqa.selenium.By;

public class LandingView extends TrackerView{

    public static final String RELATIVE_URI = "";
    public static final String TITLE = "Landing";

    public LandingView(String relativeUri) {
        super(RELATIVE_URI);
    }

    public static LandingView getInstance(String relativeUri) {
        return new LandingView(relativeUri);
    }

    public String getTitle() {
        return getElementById(TITLE).getText();
    }
}
