package com.mediatracker.view.Landing;

import com.mediatracker.data.show.Show;
import com.mediatracker.data.user.User;

import java.util.ArrayList;
import java.util.List;

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
        return user.getImageUrl();
    }

    @Override
    public String getUserTotalCompleted() {
        int totalComplete = 0;
        for (Show show : user.getShowList()) {
            if("Completed".equals(show.getStatus())){
                totalComplete++;
            }
        }
        return String.format("Shows Completed: %d", totalComplete);
    }

    @Override
    public String getUserName() {
        return String.format("Welcome, %s", user.getName() );
    }

    @Override
    public List<String> getOnGoingListName() {
        List<String> showNames = new ArrayList<>();
        for(Show show : user.getShowList()){
            showNames.add(show.getTitle());
        }
        return showNames;
    }
}
