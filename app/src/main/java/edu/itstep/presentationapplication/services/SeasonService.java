package edu.itstep.presentationapplication.services;

import java.util.ArrayList;

import edu.itstep.presentationapplication.R;
import edu.itstep.presentationapplication.entities.Season;

public class SeasonService {
    private final static String FIRST_SEASON_TITLE = "Winter";
    private final static String FIRST_SEASON_DESCRIPTION =
                    "It is the season with the shortest days and the lowest temperatures. " +
                    "In areas further away from the equator, winter is often marked by snow. " +
                    "Depending on place and culture, what is considered to be the " +
                    "start and end of winter vary.";
    private final static int FIRST_SEASON_IMAGE = R.drawable.winter;

    private final static String SECOND_SEASON_TITLE = "Spring";
    private final static String SECOND_SEASON_DESCRIPTION =
                    "Spring is the season during which the natural world revives and reinvigorates " +
                    "after the colder winter months. During spring, dormant plants begin " +
                    "to grow again, new seedlings sprout out of the ground " +
                    "and hibernating animals awake.";
    private final static int SECOND_SEASON_IMAGE = R.drawable.spring;

    private final static String THIRD_SEASON_TITLE = "Summer";
    private final static String THIRD_SEASON_DESCRIPTION =
                    "In this time of the year, days become warm, " +
                    "hot and really long, while nights in this season are the shortest. " +
                    "Sun shines so bright and everything around is whispering to go outdoors!";
    private final static int THIRD_SEASON_IMAGE = R.drawable.summer;

    private final static String FOURTH_SEASON_TITLE = "Autumn";
    private final static String FOURTH_SEASON_DESCRIPTION =
                    "Autumn is the season after summer, when leaves fall from trees. " +
                    "It's also the season when the days get shorter and colder, " +
                    "and everything turns brown and drab, but people like it anyway, " +
                    "for the cocoa and cider, probably.";
    private final static int FOURTH_SEASON_IMAGE = R.drawable.autumn;

    public static ArrayList<Season> getSeasonList() {
        ArrayList<Season> seasons = new ArrayList<>();

        seasons.add(new Season(
                FIRST_SEASON_TITLE,
                FIRST_SEASON_DESCRIPTION,
                FIRST_SEASON_IMAGE
        ));

        seasons.add(new Season(
                SECOND_SEASON_TITLE,
                SECOND_SEASON_DESCRIPTION,
                SECOND_SEASON_IMAGE
        ));

        seasons.add(new Season(
                THIRD_SEASON_TITLE,
                THIRD_SEASON_DESCRIPTION,
                THIRD_SEASON_IMAGE
        ));

        seasons.add(new Season(
                FOURTH_SEASON_TITLE,
                FOURTH_SEASON_DESCRIPTION,
                FOURTH_SEASON_IMAGE
        ));

        return  seasons;
    }
}
