package com.MediaTracker.UserService.Service;

import com.MediaTracker.UserService.Models.ShowList;
import com.MediaTracker.UserService.Repository.ShowListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class ShowListServiceImpl implements ShowListService{
    @Autowired
    ShowListRepository showListRepository;

    @Override
    public List<ShowList> getAll() {
        return showListRepository.findAll();
    }

    @Override
    public List<ShowList> getListByUserId(int id) {
        return showListRepository.findByUserid(id);
    }
}
