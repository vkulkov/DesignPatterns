package com.lesson_6.controller.receiver;

public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    private String location;
    private int speed;

    public CeilingFan(String location) {
        this.location = location;
        speed = OFF;
    }

    public void high() {
        speed = HIGH;
        System.out.println("Fan speed is high");
    }

    public void medium() {
        speed = MEDIUM;
        System.out.println("Fan speed is medium");
    }

    public void low() {
        speed = LOW;
        System.out.println("Fan speed is low");
    }

    public void off() {
        speed = OFF;
        System.out.println("Fan is off");
    }

    public int getSpeed() {
        return speed;
    }

    public String getLocation() {
        return location;
    }
}
