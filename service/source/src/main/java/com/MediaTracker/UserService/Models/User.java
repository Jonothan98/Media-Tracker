package com.MediaTracker.UserService.Models;

import com.MediaTracker.UserService.Models.MediaItems.BookItem;
import com.MediaTracker.UserService.Models.MediaItems.GameItem;
import com.MediaTracker.UserService.Models.MediaItems.MovieItem;
import com.MediaTracker.UserService.Models.MediaItems.ShowItem;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long user_id;

    @Column(name = "NAME")
    private String user_name;

    @Column(name = "EMAIL")
    private String email;
    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "IMAGE_URL")
    private String image_url;

    @OneToMany(cascade = CascadeType.ALL)
    @Column(name = "SHOW_LIST")
    @JoinColumn(name = "fk_ID", referencedColumnName = "ID")
    private List<ShowItem> showItem;

    @OneToMany(cascade = CascadeType.ALL)
    @Column(name = "BOOK_LIST")
    @JoinColumn(name = "fk_ID", referencedColumnName = "ID")
    private List<BookItem> bookItem;

    @OneToMany(cascade = CascadeType.ALL)
    @Column(name = "MOVIE_LIST")
    @JoinColumn(name = "fk_ID", referencedColumnName = "ID")
    private List<MovieItem> movieItem;

    @OneToMany(cascade = CascadeType.ALL)
    @Column(name = "GAME_LIST")
    @JoinColumn(name = "fk_ID", referencedColumnName = "ID")
    private List<GameItem> gameItem;

    public User(Long user_id, String user_name, String email, String password, String image_url, List<ShowItem> showItem, List<BookItem> bookItem, List<MovieItem> movieItem, List<GameItem> gameItem) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.email = email;
        this.password = password;
        this.image_url = image_url;
        this.showItem = showItem;
        this.bookItem = bookItem;
        this.movieItem = movieItem;
        this.gameItem = gameItem;
    }

    public User() {
    }

    public List<ShowItem> getShowItem() {
        return showItem;
    }

    public void setShowItem(List<ShowItem> showItem) {
        this.showItem = showItem;
    }

    public List<BookItem> getBookItem() {
        return bookItem;
    }

    public void setBookItem(List<BookItem> bookItem) {
        this.bookItem = bookItem;
    }

    public List<MovieItem> getMovieItem() {
        return movieItem;
    }

    public void setMovieItem(List<MovieItem> movieItem) {
        this.movieItem = movieItem;
    }

    public List<GameItem> getGameItem() {
        return gameItem;
    }

    public void setGameItem(List<GameItem> gameItem) {
        this.gameItem = gameItem;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
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
