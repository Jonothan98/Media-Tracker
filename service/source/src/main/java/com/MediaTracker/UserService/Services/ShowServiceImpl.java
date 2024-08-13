package com.MediaTracker.UserService.Services;

import com.MediaTracker.UserService.Models.ShowItem;
import com.MediaTracker.UserService.Repository.ShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class ShowServiceImpl implements ShowService {
    @Autowired
    ShowRepository showRepository;

    @Override
    public Collection<ShowItem> getAllShows() {
        return showRepository.findAll();
    }

    @Override
    public Optional<ShowItem> getShowById(String id) {
        return showRepository.findById(Long.valueOf(id));
    }

    @Override
    public void newShow(ShowItem showItem) {
        showRepository.save(showItem);
    }

    @Override
    public void updateShow(Long id, ShowItem newShow) {
        showRepository.findById(id).map(
                showItem -> {
                    showItem.setName(newShow.getName());
                    showItem.setStatus(newShow.getStatus());
                    showItem.setCurrent_episode(newShow.getCurrent_episode());
                    showItem.setImage_url(newShow.getImage_url());
                    showItem.setTotal_episodes(newShow.getTotal_episodes());
                    return showRepository.save(showItem);
                }).orElseGet(() -> {
            newShow.setShow_id(id);
            return showRepository.save(newShow);
        });
    }

    @Override
    public void deleteShow(Long id) {
        showRepository.deleteById(id);
    }
}
