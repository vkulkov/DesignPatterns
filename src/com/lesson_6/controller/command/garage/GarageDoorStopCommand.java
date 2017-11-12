package com.lesson_6.controller.command.garage;

import com.lesson_6.controller.Command;
import com.lesson_6.controller.receiver.GarageDoor;

public class GarageDoorStopCommand implements Command {
    private GarageDoor garageDoor;

    public GarageDoorStopCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.stop();
    }

    @Override
    public void undo() {

    }
}
