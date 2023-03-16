package com.mediatracker.data.show;

public class Show {
    private final int SHOW_ID;
    private final String TITLE;
    private final int TOTAL_EPISODES;
    private final int CURRENT_EPISODE;
    private final String SHOW_STATUS;

    private Show(ShowDefinition showDefinition) {
        SHOW_ID = showDefinition.getSHOW_ID();
        TITLE = showDefinition.getTITLE();
        TOTAL_EPISODES = showDefinition.getTOTAL_EPISODES();
        CURRENT_EPISODE = showDefinition.getCURRENT_EPISODE();
        SHOW_STATUS = showDefinition.getSHOW_STATUS();
    }

    public static Show getInstance(){
        return new Show(null);
    }
    public static Show getInstance(ShowDefinition showDefinition){
        return new Show(showDefinition);
    }

    public int getSHOW_ID() {
        return SHOW_ID;
    }

    public String getTITLE() {
        return TITLE;
    }

    public int getTOTAL_EPISODES() {
        return TOTAL_EPISODES;
    }

    public int getCURRENT_EPISODE() {
        return CURRENT_EPISODE;
    }

    public String getSHOW_STATUS() {
        return SHOW_STATUS;
    }
}
