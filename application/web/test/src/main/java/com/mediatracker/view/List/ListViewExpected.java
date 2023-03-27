package com.mediatracker.view.List;

public class ListViewExpected implements ListViewCalibratable{
    public static ListViewExpected getInstance() {
        return new ListViewExpected();
    }

    @Override
    public String getTitle() {
        return "Show List";
    }
}
