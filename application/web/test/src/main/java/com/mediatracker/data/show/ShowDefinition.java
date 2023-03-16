package com.mediatracker.data.show;

public class ShowDefinition {

    private int SHOW_ID;
    private String TITLE;
    private int TOTAL_EPISODES;
    private int CURRENT_EPISODE;
    private String SHOW_STATUS;

    public ShowDefinition(int SHOW_ID, String TITLE, int TOTAL_EPISODES, int CURRENT_EPISODE, String SHOW_STATUS) {
        this.SHOW_ID = SHOW_ID;
        this.TITLE = TITLE;
        this.TOTAL_EPISODES = TOTAL_EPISODES;
        this.CURRENT_EPISODE = CURRENT_EPISODE;
        this.SHOW_STATUS = SHOW_STATUS;
    }
    public int getSHOW_ID() {
        return SHOW_ID;
    }

    public void setSHOW_ID(int SHOW_ID) {
        this.SHOW_ID = SHOW_ID;
    }

    public String getTITLE() {
        return TITLE;
    }

    public void setTITLE(String TITLE) {
        this.TITLE = TITLE;
    }

    public int getTOTAL_EPISODES() {
        return TOTAL_EPISODES;
    }

    public void setTOTAL_EPISODES(int TOTAL_EPISODES) {
        this.TOTAL_EPISODES = TOTAL_EPISODES;
    }

    public int getCURRENT_EPISODE() {
        return CURRENT_EPISODE;
    }

    public void setCURRENT_EPISODE(int CURRENT_EPISODE) {
        this.CURRENT_EPISODE = CURRENT_EPISODE;
    }

    public String getSHOW_STATUS() {
        return SHOW_STATUS;
    }

    public void setSHOW_STATUS(String SHOW_STATUS) {
        this.SHOW_STATUS = SHOW_STATUS;
    }
}
