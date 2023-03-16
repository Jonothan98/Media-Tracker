package com.mediatracker.view;

import com.mediatracker.data.show.Show;
import com.mediatracker.data.user.User;

public class LandingViewExpected implements LandingViewCalibratable {
    private final User user;

    public LandingViewExpected(User user) {
        this.user = user;
    }

    public static LandingViewExpected getInstance() {
        return new LandingViewExpected(null);
    }

    public static LandingViewExpected getInstance(User user) {
        return new LandingViewExpected(user);
    }

    @Override
    public String getTitle() {
        return "Welcome to Media Tracker";
    }

    @Override
    public String getUserImage() {
        return user.getIMAGE_URL();
    }

    @Override
    public String getUserTotalCompleted() {
        int totalComplete = 0;
        for (Show show : User.getInstance().getSHOW_LIST()) {
            if(show.getSHOW_STATUS() == "Completed"){
                totalComplete++;
            }
        }
        return String.valueOf(totalComplete);
    }
}
