package com.MediaTracker.UserService.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "list")
public class ShowList {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer show_id;
    @Column(name = "show_name",length = 255)
    private String showName;
    private int show_episodes;
    private int current_episode;
    private String status;
    private String image_url;
    @Column(name = "user_user_id")
    private int user_id;

    public ShowList() {
    }

    public Integer getShow_id() {
        return show_id;
    }

    public void setShow_id(Integer show_id) {
        this.show_id = show_id;
    }

    public String getShowName() {
        return showName;
    }

    public void setShowName(String showName) {
        this.showName = showName;
    }

    public int getShow_episodes() {
        return show_episodes;
    }

    public void setShow_episodes(int show_episodes) {
        this.show_episodes = show_episodes;
    }

    public int getCurrent_episode() {
        return current_episode;
    }

    public void setCurrent_episode(int current_episode) {
        this.current_episode = current_episode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
}
