package com.MediaTracker.UserService.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "showItem")
public class ShowItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long show_id;
    @Column(name = "show_name",length = 255)
    private String name;
    private int total_episodes;
    private int current_episode;

    @Enumerated
    private MediaStatus status;
    private String image_url;


    public ShowItem(Long media_id, String name, int total_episodes, int current_episode, MediaStatus status, String image_url) {
        this.show_id = media_id;
        this.name = name;
        this.total_episodes = total_episodes;
        this.current_episode = current_episode;
        this.status = status;
        this.image_url = image_url;
    }

    public ShowItem() {
    }

    public Long getShow_id() {
        return show_id;
    }

    public void setShow_id(Long setId) {
        this.show_id = setId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotal_episodes() {
        return total_episodes;
    }

    public void setTotal_episodes(int total_episodes) {
        this.total_episodes = total_episodes;
    }

    public int getCurrent_episode() {
        return current_episode;
    }

    public void setCurrent_episode(int current_episode) {
        this.current_episode = current_episode;
    }

    public MediaStatus getStatus() {
        return status;
    }

    public void setStatus(MediaStatus status) {
        this.status = status;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }
}