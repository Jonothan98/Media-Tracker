package com.mediatracker.view.List;

import java.util.ArrayList;
import java.util.List;

public class ListViewExpected implements ListViewCalibratable{
    public static ListViewExpected getInstance() {
        return new ListViewExpected();
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
}
