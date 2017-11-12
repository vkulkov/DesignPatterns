package com.lesson_6;

import com.lesson_6.controller.Command;
import com.lesson_6.controller.command.garage.GarageDoorOpenCommand;
import com.lesson_6.controller.receiver.GarageDoor;
import com.lesson_6.controller.receiver.Light;
import com.lesson_6.controller.command.light.LightOnCommand;
import com.lesson_6.controller.SimpleRemoteController;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteController remoteControl = new SimpleRemoteController();
        Light light = new Light("House");
        Command lightOn = new LightOnCommand(light);
        remoteControl.setCommand(lightOn);
        remoteControl.buttonWasPressed();

        GarageDoor garageDoor = new GarageDoor();
        Command garageDoorOpen = new GarageDoorOpenCommand(garageDoor);
        remoteControl.setCommand(garageDoorOpen);
        remoteControl.buttonWasPressed();
    }
}
