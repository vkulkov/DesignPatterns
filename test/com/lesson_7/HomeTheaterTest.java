package com.lesson_7;

import com.lesson_7.facade.HomeTheaterFacade;
import com.lesson_7.facade.hometheater.*;

public class HomeTheaterTest {
    public static void main(String[] args) {
        Amplifier amp = new Amplifier("Amplifier");
        CDPlayer cd = new CDPlayer("CD Player", amp);
        DVDPlayer dvd = new DVDPlayer("DVD Player", amp);
        PopcornPopper popper = new PopcornPopper("Popcorn");
        Projector projector = new Projector("Projector", dvd);
        Screen screen = new Screen("Screen");
        TheaterLights lights = new TheaterLights("Theater Lights");
        Tuner tuner = new Tuner("Tuner", amp);

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, cd, dvd, popper, projector, screen, lights, tuner);
        homeTheater.watchMovie("The Room");
        homeTheater.endMovie();
    }
}
