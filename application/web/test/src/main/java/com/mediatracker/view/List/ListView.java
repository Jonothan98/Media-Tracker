package com.mediatracker.view.List;

import com.mediatracker.view.TrackerView;

public class ListView extends TrackerView implements ListViewCalibratable {

    private static final String RELATIVE_URI = "show-list";

    protected ListView(String relativeUri) {
        super(relativeUri);
    }

    public static ListView getInstance() {
        return new ListView(RELATIVE_URI);
    }

    @Override
    public String getTitle() {
        return getElementById("show-list").getText();
    }
}
