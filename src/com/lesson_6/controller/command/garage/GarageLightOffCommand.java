package com.lesson_6.controller.command.garage;

import com.lesson_6.controller.Command;
import com.lesson_6.controller.receiver.GarageDoor;

public class GarageLightOffCommand implements Command {
    private GarageDoor garageDoor;

    public GarageLightOffCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.lightOff();
    }

    @Override
    public void undo() {
        garageDoor.lightOn();
    }
}
