package com.lesson_11.remote.state;

import com.lesson_11.remote.GumballMachine;
import com.lesson_11.remote.State;

public class SoldOutState implements State {
    private transient GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert a quarter, the machine is sold out");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }

    @Override
    public void pullLever() {
        System.out.println("You turned, but there are no gumballs");
    }

    @Override
    public void giveGumball() {
        System.out.println("No gumball dispensed");
    }

    public String toString() {
        return "sold out";
    }
}
