package com.lesson_6;

import com.lesson_6.controller.RemoteController;
import com.lesson_6.controller.command.ceiling.CeilingFanHighCommand;
import com.lesson_6.controller.command.ceiling.CeilingFanOffCommand;
import com.lesson_6.controller.command.garage.GarageDoorCloseCommand;
import com.lesson_6.controller.command.garage.GarageDoorOpenCommand;
import com.lesson_6.controller.command.light.LightOffCommand;
import com.lesson_6.controller.command.light.LightOnCommand;
import com.lesson_6.controller.command.stereo.StereoOffCommand;
import com.lesson_6.controller.command.stereo.StereoOnWithCD;
import com.lesson_6.controller.receiver.CeilingFan;
import com.lesson_6.controller.receiver.GarageDoor;
import com.lesson_6.controller.receiver.Light;
import com.lesson_6.controller.receiver.Stereo;

public class RemoteLoaderTest {
    public static void main(String[] args) {
        RemoteController controller = new RemoteController(7);

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan fan = new CeilingFan("Living Room");
        GarageDoor door = new GarageDoor();
        Stereo stereo = new Stereo();

        controller.setCommands(0, new LightOnCommand(livingRoomLight), new LightOffCommand(livingRoomLight));
        controller.setCommands(1, new LightOnCommand(kitchenLight), new LightOffCommand(kitchenLight));
        controller.setCommands(2, new CeilingFanHighCommand(fan), new CeilingFanOffCommand(fan));
        controller.setCommands(3, new GarageDoorOpenCommand(door), new GarageDoorCloseCommand(door));
        controller.setCommands(4, new StereoOnWithCD(stereo), new StereoOffCommand(stereo));

        controller.onButtonWasPushed(0);
        controller.onButtonWasPushed(0);
        controller.offButtonWasPushed(0);

        System.out.println(controller.toString());

        controller.undoButtonWasPushed();
        controller.onButtonWasPushed(1);
        controller.offButtonWasPushed(1);
        controller.onButtonWasPushed(2);
        controller.offButtonWasPushed(2);
        controller.onButtonWasPushed(3);

        System.out.println(controller.toString());

        controller.undoButtonWasPushed();
        controller.onButtonWasPushed(4);
        controller.offButtonWasPushed(4);
    }
}
