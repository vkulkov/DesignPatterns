package com.lesson_6.simple;

public class SimpleRemoteController {
    private Command slot;

    public SimpleRemoteController() {}

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
