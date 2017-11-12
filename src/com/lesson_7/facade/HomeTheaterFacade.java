package com.lesson_7.facade;

import com.lesson_7.facade.hometheater.*;

public class HomeTheaterFacade {
    private Amplifier amp;
    private CDPlayer cd;
    private DVDPlayer dvd;
    private PopcornPopper popper;
    private Projector projector;
    private Screen screen;
    private TheaterLights lights;
    private Tuner tuner;

    public HomeTheaterFacade(Amplifier amp, CDPlayer cd, DVDPlayer dvd, PopcornPopper popper,
                             Projector projector, Screen screen, TheaterLights lights, Tuner tuner) {
        this.amp = amp;
        this.cd = cd;
        this.dvd = dvd;
        this.popper = popper;
        this.projector = projector;
        this.screen = screen;
        this.lights = lights;
        this.tuner = tuner;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        popper.on();
        popper.pop();
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setDvd(dvd);
        amp.setSurroundSound();
        amp.setVolume(5);
        dvd.on();
        dvd.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        popper.off();
        lights.on();
        screen.up();
        projector.off();
        amp.off();
        dvd.stop();
        dvd.eject();
        dvd.off();
    }
}
