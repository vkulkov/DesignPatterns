package com.lesson_6;

import com.lesson_6.controller.Command;
import com.lesson_6.controller.RemoteController;
import com.lesson_6.controller.command.MacroCommand;
import com.lesson_6.controller.command.hottub.HottubOffCommand;
import com.lesson_6.controller.command.hottub.HottubOnCommand;
import com.lesson_6.controller.command.light.LightOffCommand;
import com.lesson_6.controller.command.light.LightOnCommand;
import com.lesson_6.controller.command.stereo.StereoOffCommand;
import com.lesson_6.controller.command.stereo.StereoOnCommand;
import com.lesson_6.controller.command.tv.TVOffCommand;
import com.lesson_6.controller.command.tv.TVOnCommand;
import com.lesson_6.controller.receiver.HotTub;
import com.lesson_6.controller.receiver.Light;
import com.lesson_6.controller.receiver.Stereo;
import com.lesson_6.controller.receiver.TV;

public class MacroCommandTest {
    public static void main(String[] args) {
        RemoteController partyController = new RemoteController(1);

        Light light = new Light("Living Room");
        TV tv = new TV("Living Room");
        Stereo stereo = new Stereo();
        HotTub hotTub = new HotTub();

        Command[] partyOn = {new LightOffCommand(light), new StereoOnCommand(stereo), new TVOnCommand(tv), new HottubOnCommand(hotTub)};
        Command[] partyOff = {new LightOnCommand(light), new StereoOffCommand(stereo), new TVOffCommand(tv), new HottubOffCommand(hotTub)};

        partyController.setCommands(0, new MacroCommand(partyOn), new MacroCommand(partyOff));

        System.out.println(partyController);
        System.out.println("--- Pushing Macro On ---");
        partyController.onButtonWasPushed(0);
        System.out.println("--- Pushing Macro Off ---");
        partyController.offButtonWasPushed(0);
    }
}
