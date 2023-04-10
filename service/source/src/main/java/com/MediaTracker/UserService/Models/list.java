package com.MediaTracker.UserService.Models;

import jakarta.persistence.*;

@Entity
public class list {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer show_id;
    @Column(name = "show_name",length = 255)
    private String showName;
    private int show_episodes;
    private int current_episode;
    private String status;
    private String image_url;
}
