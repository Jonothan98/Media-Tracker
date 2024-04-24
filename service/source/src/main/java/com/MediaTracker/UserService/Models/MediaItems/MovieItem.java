package com.MediaTracker.UserService.Models.MediaItems;

import jakarta.persistence.*;

@Entity
public class MovieItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long media_id;
    @Column(name = "movie_name",length = 255)
    private String name;
    @Enumerated
    private MediaStatus status;
    private String image_url;

    public MovieItem(Long media_id, String name, MediaStatus status, String image_url) {
        this.media_id = media_id;
        this.name = name;
        this.status = status;
        this.image_url = image_url;
    }

    public MovieItem() {
    }

    public Long getMedia_id() {
        return media_id;
    }

    public void setMedia_id(Long media_id) {
        this.media_id = media_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
