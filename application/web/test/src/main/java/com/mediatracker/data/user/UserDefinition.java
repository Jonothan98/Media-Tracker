package com.mediatracker.data.user;

import com.mediatracker.data.show.Show;

import java.util.List;

public class UserDefinition {
    private int id;
    private String name;


    private String imageUrl;
    private List<Show> showList;

    public UserDefinition(int id, String name, String imageUrl, List<Show> showList) {
        this.id = id;
        this.name = name;
        this.imageUrl = imageUrl;
        this.showList = showList;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public List<Show> getShowList() {
        return showList;
    }

}
