package com.mediatracker.view.Landing;

import com.mediatracker.view.TrackerView;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class LandingView extends TrackerView implements LandingViewCalibratable {

    public static final String RELATIVE_URI = "";


    public LandingView(String relativeUri) {
        super(relativeUri);
    }

    public static LandingView getInstance() {
        return new LandingView(RELATIVE_URI);
    }

    public static LandingView getInstance(String relativeUri) {
        return new LandingView(String.format("?user_id=%s", relativeUri));
    }

    @Override
    public String getTitle() {
        String locatorValue = "landing-title";
        return getElementById(locatorValue).getText();
    }

    @Override
    public String getUserImage() {
        String locatorValue = "//*[@id=\"image-url\"]";
        WebElement imageElement = getElementByXpath(locatorValue);
        return imageElement.getAttribute("src");
    }

    @Override
    public String getUserTotalCompleted() {
        String locatorValue = "total-shows-completed";
        return getElementById(locatorValue).getText();
    }

    @Override
    public String getUserName() {
        String locatorValue = "user-name";
        return getElementById(locatorValue).getText();
    }

    @Override
    public List<String> getOnGoingListName() {
        List<String> showNames = new ArrayList<>();
        String locatorValue = "on-going-list";
        WebElement list = getElementById(locatorValue);
        List<WebElement> childElements = list.findElements(By.xpath("./child::*"));
        for (WebElement show : childElements) {
            showNames.add(show.getText());
        }
        return showNames;
    }
}
