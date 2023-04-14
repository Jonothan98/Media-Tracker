package com.MediaTracker.UserService.Controllers;

import com.MediaTracker.UserService.Models.ShowList;
import com.MediaTracker.UserService.Service.ShowListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ShowListController {

    @Autowired
    ShowListService showListService;

    @GetMapping("/list")
    public List<ShowList> getAll() {
        return showListService.getAll();
    }

    @GetMapping("/list/{id}")
    public List<ShowList> getByUserId(@PathVariable int id) {
        return showListService.getListByUserId(id);
    }
}
