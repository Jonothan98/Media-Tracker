package com.mediatracker.view;

import com.mediatracker.data.show.Show;
import com.mediatracker.data.show.ShowDefinition;
import com.mediatracker.data.user.User;
import com.mediatracker.data.user.UserDefinition;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class LandingViewTest {
    @Test
    public void smoke() {
        String expected = LandingViewExpected.getInstance().getTitle();
        LandingView landingView = LandingView.getInstance();
        String actual = landingView.getTitle();
        landingView.closeDriver();

        assertEquals(actual, expected);
    }

    @Test
    public void userInfoIsDisplayed() {
        ShowDefinition showDefinition = new ShowDefinition(1, "Last of Us", 9, 4, "on going");
        Show show = Show.getInstance(showDefinition);

        List<Show> showList = new ArrayList<>();
        showList.add(show);

        UserDefinition userDefinition = new UserDefinition(1, "Jimmy", "https://cdn-icons-png.flaticon.com/512/3135/3135715.png", showList);
        User user = User.getInstance(userDefinition);

        LandingViewExpected landingViewExpected = LandingViewExpected.getInstance(user);
        LandingView landingView = LandingView.getInstance(String.valueOf(user.getId()));

        String expectedUserName = landingViewExpected.getUserName();
        String actualUserName = landingView.getUserName();
        assertEquals(actualUserName, expectedUserName);

        String expectedUserImage = landingViewExpected.getUserImage();
        String actualUserImage = landingView.getUserImage();
        assertEquals(actualUserImage,expectedUserImage);

        String expectedUserTotalCompleted = landingViewExpected.getUserTotalCompleted();
        String actualUserTotalCompleted = landingView.getUserTotalCompleted();
        landingView.closeDriver();
        assertEquals(actualUserTotalCompleted,expectedUserTotalCompleted);
    }
}
