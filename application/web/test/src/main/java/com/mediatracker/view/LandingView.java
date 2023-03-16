package com.mediatracker.view;

public class LandingView extends TrackerView implements LandingViewCalibratable {

    public static final String RELATIVE_URI = "";



    public LandingView(String relativeUri) {
        super(relativeUri);
    }

    public static LandingView getInstance() {
        return new LandingView(RELATIVE_URI);
    }
    public static LandingView getInstance(String relativeUri){
        return new LandingView(String.format("%s/?user_id=%s", relativeUri, relativeUri));
    }

    @Override
    public String getTitle() {
        String locatorValue = "landing-title";
        return getElementById(locatorValue).getText();
    }

    @Override
    public String getUserImage() {
        String locatorValue = "image-url";
        return getElementById(locatorValue).getText();
    }

    @Override
    public String getUserTotalCompleted() {
        String locatorValue = "total-shows-completed";
        return getElementById(locatorValue).getText();
    }
}
