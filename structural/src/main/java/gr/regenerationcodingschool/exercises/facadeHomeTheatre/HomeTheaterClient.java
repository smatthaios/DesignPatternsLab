package gr.regenerationcodingschool.exercises.facadeHomeTheatre;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HomeTheaterClient {
    private static final Logger LOGGER = LoggerFactory.getLogger(HomeTheaterClient.class);

    public static void main(String[] args) {
        LOGGER.info("Create the appropriate home theater object that implements the appropriate functionality");

        Tuner tuner = new Tuner("A Tuner");
        DvdPlayer dvd = new DvdPlayer("A DVD Player");
        CdPlayer cd = new CdPlayer("A CD Player");
        Projector projector = new Projector("A Projector", dvd);
        Screen screen = new Screen("A Theater Screen");

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(tuner, dvd, cd, projector, screen);

        homeTheater.playMovie("Lord of the Rings - The return of the King");
        homeTheater.stopMovie();

        homeTheater.startCdPlayer("Red hot chili peppers - Californication");
        homeTheater.stopCdPlayer();

        homeTheater.startRadio(96.3);
        homeTheater.stopRadio();
    }
}
