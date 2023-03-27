package com.mediatracker.view;

import com.mediatracker.view.List.ListView;
import com.mediatracker.view.List.ListViewExpected;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ListViewTest {

    @Test
    public void smoke(){
        ListViewExpected listViewExpected = ListViewExpected.getInstance();
        ListView listView = ListView.getInstance();

        String expected = listViewExpected.getTitle();
        String actual = listView.getTitle();
        listView.closeDriver();
        assertEquals(actual,expected);
    }

}