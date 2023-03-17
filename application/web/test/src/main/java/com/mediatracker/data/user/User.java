package com.mediatracker.data.user;

import com.mediatracker.data.show.Show;

import java.util.List;

public class User {

    private final int id;

    private final String name;
    private final String imageUrl;
    private final List<Show> showList;

    private User(UserDefinition userDefinition) {
        id = userDefinition.getId();
        imageUrl = userDefinition.getImageUrl();
        showList = userDefinition.getShowList();
        name = userDefinition.getName();
    }

    public static User getInstance() {
        return new User(null);
    }
    public static User getInstance(UserDefinition userDefinition){
        return new User(userDefinition);
    }

    public int getId() {
        return id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public List<Show> getShowList() {
        return showList;
    }

    public String getName() {
        return name;
    }
}
