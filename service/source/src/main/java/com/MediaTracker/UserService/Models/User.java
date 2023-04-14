package com.MediaTracker.UserService.Models;

import javax.persistence.*;

@Entity
@Table(name = "user")
@SecondaryTable(name = "list", pkJoinColumns = @PrimaryKeyJoinColumn(name = "user_user_id"))
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer user_id;
    private String user_name;
    private String email;
    private String password;
    private String image_url;

    public User() {
    }

    public User(Integer user_id, String user_name, String email, String password, String image_url) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.email = email;
        this.password = password;
        this.image_url = image_url;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", user_name='" + user_name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", image_url='" + image_url + '\'' +
                '}';
    }
}
