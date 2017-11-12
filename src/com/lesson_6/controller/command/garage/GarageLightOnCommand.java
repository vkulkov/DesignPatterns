package com.lesson_6.controller.command.garage;

import com.lesson_6.controller.Command;
import com.lesson_6.controller.receiver.GarageDoor;

public class GarageLightOnCommand implements Command {
    private GarageDoor garageDoor;

    public GarageLightOnCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.lightOn();
    }

    @Override
    public void undo() {
        garageDoor.lightOff();
    }
}
