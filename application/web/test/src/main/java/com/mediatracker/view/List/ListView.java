package com.mediatracker.view.List;

import com.mediatracker.view.TrackerView;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ListView extends TrackerView implements ListViewCalibratable {

    private static final String RELATIVE_URI = "show-list";

    protected ListView(String relativeUri) {
        super(relativeUri);
    }

    public static ListView getInstance() {
        return new ListView(RELATIVE_URI);
    }

    public static ListView getInstance(String userId) {
        return new ListView(String.format("%s?user_id=%s", RELATIVE_URI, userId));
    }

    @Override
    public String getTitle() {
        return getElementById("show-list").getText();
    }

    @Override
    public List<String> getStatusOptions() {
        List<String> statusOptions = new ArrayList<>();
        String locatorValue = "status-options";
        WebElement options = getElementById(locatorValue);
        List<WebElement> childElements = options.findElements(By.name("options"));
        for (WebElement status : childElements) {
            statusOptions.add(status.getText());
        }
        return statusOptions;
    }

    @Override
    public List<String> getOnGoingList() {
        List<String> onGoingNames = new ArrayList<>();
        String locatorValue = "on-going-list";
        WebElement list = getElementById(locatorValue);
        List<WebElement> childElements = list.findElements(By.id("on-going"));
        for(WebElement show: childElements){
            onGoingNames.add(show.getText());
        }
        return onGoingNames;
    }
}
