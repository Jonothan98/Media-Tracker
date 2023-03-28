package com.mediatracker.view;

import com.mediatracker.data.show.Show;
import com.mediatracker.data.show.ShowDefinition;
import com.mediatracker.data.user.User;
import com.mediatracker.data.user.UserDefinition;
import com.mediatracker.view.List.ListView;
import com.mediatracker.view.List.ListViewExpected;
import org.testng.annotations.Test;

import java.util.ArrayList;
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

    @Test
    public void testOnGoingList(){
        ShowDefinition showDefinition = new ShowDefinition(1, "Last of Us", 9, 4, "on going");
        Show show1 = Show.getInstance(showDefinition);

        ShowDefinition showDefinition2 = new ShowDefinition(2,"House of the Dragon",10,1,"on going");
        Show show2 = Show.getInstance(showDefinition2);

        List<Show> showList = new ArrayList<>();
        showList.add(show1);
        showList.add(show2);

        UserDefinition userDefinition = new UserDefinition(1, "Jimmy", "https://cdn-icons-png.flaticon.com/512/3135/3135715.png", showList);
        User user = User.getInstance(userDefinition);

        ListViewExpected listViewExpected = ListViewExpected.getInstance(user);
        ListView listView = ListView.getInstance(String.valueOf(user.getId()));

        List<String> expected = listViewExpected.getOnGoingList();
        List<String> actual = listView.getOnGoingList();
        assertEquals(actual,expected);
    }

}