package com.lesson_11.remote;

import java.io.Serializable;

public interface State extends Serializable {
    void insertQuarter();
    void ejectQuarter();
    void pullLever();
    void giveGumball();
}
