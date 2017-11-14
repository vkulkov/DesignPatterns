package com.lesson_10.gumballstate;

public interface State {
    void insertQuarter();
    void ejectQuarter();
    void pullLever();
    void giveGumball();
}
