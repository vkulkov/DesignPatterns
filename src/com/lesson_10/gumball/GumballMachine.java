package com.lesson_10.gumball;

public class GumballMachine {
    private static final int SOLD_OUT = 0;
    private static final int NO_QUARTER = 1;
    private static final int HAS_QUARTER = 2;
    private static final int SOLD = 3;

    private int state = SOLD_OUT;
    private int count = 0;

    public GumballMachine(int count) {
        this.count = count;
        if (count > 0) {
            state = NO_QUARTER;
        }
    }

    public void insertQuarter() {
        switch (state) {
            case NO_QUARTER:
                System.out.println("You inserted a quarter");
                state = HAS_QUARTER;
                break;
            case SOLD_OUT:
                System.out.println("You can't insert a quarter, the machine is sold out");
                break;
            case HAS_QUARTER:
                System.out.println("You can't insert another quarter");
                break;
            case SOLD:
                System.out.println("Please wait, we're already giving you a gumball");
        }
    }

    public void ejectQuarter() {
        switch (state) {
            case NO_QUARTER:
            case SOLD_OUT:
                System.out.println("You haven't inserted a quarter");
                break;
            case HAS_QUARTER:
                System.out.println("Quarter returned");
                state = NO_QUARTER;
                break;
            case SOLD:
                System.out.println("Sorry, you already turned the crank");
        }
    }

    public void pullLever() {
        switch (state) {
            case NO_QUARTER:
                System.out.println("You turned but there's no quarter");
                break;
            case SOLD_OUT:
                System.out.println("You turned, but there are no gumballs");
                break;
            case HAS_QUARTER:
                System.out.println("You turned...");
                state = SOLD;
                giveGumball();
                break;
            case SOLD:
                System.out.println("Turning twice doesn't get you another gumball!");
        }
    }

    private void giveGumball() {
        switch (state) {
            case NO_QUARTER:
                System.out.println("You have to pay first");
                break;
            case SOLD_OUT:
            case HAS_QUARTER:
                System.out.println("No gumball dispensed");
                break;
            case SOLD:
                System.out.println("A gumball comes rolling out the slot");
                count--;
                if (count == 0) {
                    System.out.println("Oops, gumball machine is sold out");
                    state = SOLD_OUT;
                } else {
                    state = NO_QUARTER;
                }
        }
    }

    public void refill(int numGumBalls) {
        this.count = numGumBalls;
        state = NO_QUARTER;
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2017\n");
        result.append("Inventory: ").append(count).append(" gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\nMachine is ");
        switch (state) {
            case SOLD_OUT:
                result.append("sold out");
                break;
            case NO_QUARTER:
                result.append("waiting for quarter");
                break;
            case HAS_QUARTER:
                result.append("waiting for turn of crank");
                break;
            case SOLD:
                result.append("delivering a gumball");
                break;
        }
        result.append("\n");
        return result.toString();
    }
}
