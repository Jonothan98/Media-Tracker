package com.MediaTracker.UserService.Models;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class UserList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long user_list_id;
    
    @JoinColumn(name = "show_id")
    private int show_id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User user;

    @JoinColumn(name = "updateAt")
    private int updatedAt;
}
