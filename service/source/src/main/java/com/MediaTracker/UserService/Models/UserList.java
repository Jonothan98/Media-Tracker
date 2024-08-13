package com.MediaTracker.UserService.Models;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class UserList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "list_id")
    private Long user_list_id;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "show_id")
    private List<ShowItem> showItem;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User user;
}
