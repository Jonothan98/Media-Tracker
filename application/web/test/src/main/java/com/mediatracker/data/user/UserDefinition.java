package com.mediatracker.data.user;

import com.mediatracker.data.show.Show;

import java.util.List;

public class UserDefinition {
    private int USER_ID;
    private String IMAGE_URL;
    private List<Show> SHOW_LIST;

    public UserDefinition(int USER_ID, String IMAGE_URL, List<Show> SHOW_LIST) {
        this.USER_ID = USER_ID;
        this.IMAGE_URL = IMAGE_URL;
        this.SHOW_LIST = SHOW_LIST;
    }
    public String getIMAGE_URL() {
        return IMAGE_URL;
    }

    public void setIMAGE_URL(String IMAGE_URL) {
        this.IMAGE_URL = IMAGE_URL;
    }

    public int getUSER_ID() {
        return USER_ID;
    }

    public void setUSER_ID(int USER_ID) {
        this.USER_ID = USER_ID;
    }

    public List<Show> getSHOW_LIST() {
        return SHOW_LIST;
    }

    public void setSHOW_LIST(List<Show> SHOW_LIST) {
        this.SHOW_LIST = SHOW_LIST;
    }

}
