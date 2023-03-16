package com.mediatracker.data.user;

import com.mediatracker.data.show.Show;

import java.util.List;

public class User {

    private final int USER_ID;
    private final String IMAGE_URL;
    private final List<Show> SHOW_LIST;

    private User(UserDefinition userDefinition) {
        USER_ID = userDefinition.getUSER_ID();
        IMAGE_URL = userDefinition.getIMAGE_URL();
        SHOW_LIST = userDefinition.getSHOW_LIST();
    }

    public static User getInstance() {
        return new User(null);
    }
    public static User getInstance(UserDefinition userDefinition){
        return new User(userDefinition);
    }

    public int getUSER_ID() {
        return USER_ID;
    }

    public String getIMAGE_URL() {
        return IMAGE_URL;
    }

    public List<Show> getSHOW_LIST() {
        return SHOW_LIST;
    }
}
