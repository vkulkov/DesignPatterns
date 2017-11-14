package com.lesson_10.gumballstate.state;

import com.lesson_10.gumballstate.GumballMachine;
import com.lesson_10.gumballstate.State;

public class SoldOutState implements State {
    private GumballMachine gumballMachine;

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
