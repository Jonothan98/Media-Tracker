package com.MediaTracker.UserService.Models.MediaItems;

import jakarta.persistence.*;

@Entity
public class BookItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long media_id;
    @Column(name = "book_name",length = 255)
    private String name;

    private int total_pages;
    private int current_page;

    @Enumerated
    private MediaStatus status;
    private String image_url;

    public BookItem(Long media_id, String name, int total_pages, int current_page, MediaStatus status, String image_url) {
        this.media_id = media_id;
        this.name = name;
        this.total_pages = total_pages;
        this.current_page = current_page;
        this.status = status;
        this.image_url = image_url;
    }

    public BookItem() {
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

    public int getTotal_pages() {
        return total_pages;
    }

    public void setTotal_pages(int total_pages) {
        this.total_pages = total_pages;
    }

    public int getCurrent_page() {
        return current_page;
    }

    public void setCurrent_page(int current_page) {
        this.current_page = current_page;
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
