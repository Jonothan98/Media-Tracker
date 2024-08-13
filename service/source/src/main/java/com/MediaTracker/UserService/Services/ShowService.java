package com.MediaTracker.UserService.Services;

import com.MediaTracker.UserService.Models.ShowItem;

import java.util.Collection;
import java.util.Optional;

public interface ShowService {

    public abstract Collection<ShowItem> getAllShows();

    public abstract Optional<ShowItem> getShowById(String id);

    public abstract void newShow(ShowItem showItem);

    public abstract void updateShow(Long id, ShowItem showItem);

    public abstract void deleteShow(Long id);
}
