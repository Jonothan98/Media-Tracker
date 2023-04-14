package com.MediaTracker.UserService.Service;

import com.MediaTracker.UserService.Models.ShowList;

import java.util.List;

public interface ShowListService {
    List<ShowList> getAll();

    List<ShowList> getListByUserId(int id);
}
