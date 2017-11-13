package com.lesson_6;

import com.lesson_6.simple.Command;
import com.lesson_6.simple.GarageDoorOpenCommand;
import com.lesson_6.simple.GarageDoor;
import com.lesson_6.simple.Light;
import com.lesson_6.simple.LightOnCommand;
import com.lesson_6.simple.SimpleRemoteController;

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
