package com.lesson_6.controller.receiver;

public class Stereo {

    public void on() {
        System.out.println("Stereo is on");
    }

    public void off() {
        System.out.println("Stereo is off");
    }

    public void setCD() {
        System.out.println("CD is in");
    }

    public void setDVD() {
        System.out.println("DVD is in");
    }

    public void setRadio() {
        System.out.println("Radio is on");
    }

    public void setVolume(int volume) {
        System.out.println("Volume: " + volume);
    }
}
