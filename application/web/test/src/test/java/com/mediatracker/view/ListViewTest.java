package com.mediatracker.view;

import com.mediatracker.view.List.ListView;
import com.mediatracker.view.List.ListViewExpected;
import org.testng.annotations.Test;

import java.util.List;

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

    @Test
    public void testStatusList(){
        ListViewExpected listViewExpected = ListViewExpected.getInstance();
        ListView listView = ListView.getInstance();

        List<String> expected = listViewExpected.getStatusOptions();
        List<String> actual = listView.getStatusOptions();
        listView.closeDriver();
        assertEquals(actual,expected);
    }

}