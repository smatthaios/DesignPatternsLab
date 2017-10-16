package gr.regenerationcodingschool.exercises.facadeHomeTheatre;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HomeTheaterFacade {
    private static final Logger LOGGER = LoggerFactory.getLogger(HomeTheaterFacade.class);

    Tuner tuner;
    DvdPlayer dvd;
    CdPlayer cdPlayer;
    Projector projector;
    Screen screen;

    public HomeTheaterFacade(Tuner tuner, DvdPlayer dvd, CdPlayer cdPlayer, Projector projector, Screen screen) {
        this.tuner = tuner;
        this.dvd = dvd;
        this.cdPlayer = cdPlayer;
        this.projector = projector;
        this.screen = screen;
    }

    public void playMovie(String movie) {
        LOGGER.info("Starting movie..");
        screen.down();
        projector.on();
        dvd.on();
        dvd.play(movie);
    }


    public void stopMovie() {
        LOGGER.info("Stopping movie..");
        screen.up();
        projector.off();
        dvd.stop();
        dvd.eject();
        dvd.off();
    }

    public void startCdPlayer(String cdTitle) {
        LOGGER.info("Starting radio..");
        cdPlayer.on();
        cdPlayer.play(cdTitle);
    }

    public void stopCdPlayer() {
        LOGGER.info("Stopping CD..");
        cdPlayer.eject();
        cdPlayer.off();
    }

    public void startRadio(double frequency) {
        LOGGER.info("Starting radio..");
        tuner.on();
        tuner.setFrequency(frequency);
    }

    public void stopRadio() {
        LOGGER.info("Stopping radio..");
        tuner.off();
    }
}
