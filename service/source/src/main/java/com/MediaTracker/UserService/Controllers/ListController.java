package com.MediaTracker.UserService.Controllers;

import com.MediaTracker.UserService.Models.ShowList;
import com.MediaTracker.UserService.Repository.ShowListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ListController {

    @Autowired
    ShowListRepository showListRepository;

    @GetMapping("/list")
    public List<ShowList> getAll() {
        return showListRepository.findAll();
    }

    @GetMapping("/list/{id}")
    public List<ShowList> getByUserId(@PathVariable int id) {
        List<ShowList> showLists = showListRepository.findAll();
        List<ShowList> listToReturn = new ArrayList<>();
        for (ShowList show : showLists) {
            if (show.getUser_id() == id) {
                listToReturn.add(show);
            }
        }
        return listToReturn;
    }
}
