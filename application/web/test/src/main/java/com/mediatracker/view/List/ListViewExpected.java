package com.mediatracker.view.List;

import com.mediatracker.data.show.Show;
import com.mediatracker.data.user.User;

import java.util.ArrayList;
import java.util.List;

public class ListViewExpected implements ListViewCalibratable{
    private final User user;

    public ListViewExpected(User user) {
        this.user = user;
    }

    public static ListViewExpected getInstance() {
        return new ListViewExpected(null);
    }

    public static ListViewExpected getInstance(User user) {
        return new ListViewExpected(user);
    }

    @Override
    public String getTitle() {
        return "Show List";
    }

    @Override
    public List<String> getStatusOptions() {
        List<String> statusOptions = new ArrayList<>();
        statusOptions.add("On Going");
        statusOptions.add("Completed");
        statusOptions.add("Plan to Watch");
        statusOptions.add("On Hold");
        return statusOptions;
    }

    @Override
    public List<String> getOnGoingList() {
        List<String> showNames = new ArrayList<>();
        for(Show show: user.getShowList()){
            showNames.add(show.getTitle());
        }
        return showNames;
    }
}
