package com.mediatracker.data.show;

public class ShowDefinition {

    private int id;
    private String title;
    private int totalEpisodes;
    private int currentEpisode;
    private String status;

    public ShowDefinition(int id, String title, int totalEpisodes, int currentEpisode, String status) {
        this.id = id;
        this.title = title;
        this.totalEpisodes = totalEpisodes;
        this.currentEpisode = currentEpisode;
        this.status = status;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTotalEpisodes() {
        return totalEpisodes;
    }

    public void setTotalEpisodes(int totalEpisodes) {
        this.totalEpisodes = totalEpisodes;
    }

    public int getCurrentEpisode() {
        return currentEpisode;
    }

    public void setCurrentEpisode(int currentEpisode) {
        this.currentEpisode = currentEpisode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
