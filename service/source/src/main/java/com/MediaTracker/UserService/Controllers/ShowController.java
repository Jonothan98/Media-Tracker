package com.MediaTracker.UserService.Controllers;

import com.MediaTracker.UserService.Models.ShowItem;
import com.MediaTracker.UserService.Services.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping("/shows")
public class ShowController {

    @Autowired
    ShowService showService;

    @GetMapping()
    Collection<ShowItem> getAllShows() {
        return showService.getAllShows();
    }

    @GetMapping("/{media_id}")
    Optional<ShowItem> getShowById(@PathVariable String media_id) {
        return showService.getShowById(media_id);
    }

    @PostMapping()
    void newShow(@RequestBody ShowItem showItem) {
        showService.newShow(showItem);
    }

    @PutMapping("/{media_id}")
    void showItem(@RequestBody ShowItem newShow, @PathVariable Long media_id) {
        showService.updateShow(media_id, newShow);
    }

    @DeleteMapping("/{media_id}")
    void deleteShow(@PathVariable Long media_id) {
        showService.deleteShow(media_id);
    }
}
