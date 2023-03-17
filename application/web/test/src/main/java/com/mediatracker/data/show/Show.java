package com.mediatracker.data.show;

public class Show {
    private final int id;
    private final String title;
    private final int totalEpisodes;
    private final int currentEpisode;
    private final String status;

    private Show(ShowDefinition showDefinition) {
        id = showDefinition.getId();
        title = showDefinition.getTitle();
        totalEpisodes = showDefinition.getTotalEpisodes();
        currentEpisode = showDefinition.getCurrentEpisode();
        status = showDefinition.getStatus();
    }

    public static Show getInstance(){
        return new Show(null);
    }
    public static Show getInstance(ShowDefinition showDefinition){
        return new Show(showDefinition);
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getTotalEpisodes() {
        return totalEpisodes;
    }

    public int getCurrentEpisode() {
        return currentEpisode;
    }

    public String getStatus() {
        return status;
    }
}
