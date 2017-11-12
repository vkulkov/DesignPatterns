package com.lesson_6;

import com.lesson_6.controller.Command;
import com.lesson_6.controller.RemoteController;
import com.lesson_6.controller.command.ceiling.CeilingFanHighCommand;
import com.lesson_6.controller.command.ceiling.CeilingFanLowCommand;
import com.lesson_6.controller.command.ceiling.CeilingFanMediumCommand;
import com.lesson_6.controller.command.ceiling.CeilingFanOffCommand;
import com.lesson_6.controller.receiver.CeilingFan;

public class FanRemoteTest {
    public static void main(String[] args) {
        RemoteController fanController = new RemoteController(3);

        CeilingFan kitchenFan = new CeilingFan("Kitchen");
        Command ceilingFanLow = new CeilingFanLowCommand(kitchenFan);
        Command ceilingFanMedium = new CeilingFanMediumCommand(kitchenFan);
        Command ceilingFanHigh = new CeilingFanHighCommand(kitchenFan);
        Command ceilingFanOff = new CeilingFanOffCommand(kitchenFan);

        fanController.setCommands(0, ceilingFanLow, ceilingFanOff);
        fanController.setCommands(1, ceilingFanMedium, ceilingFanOff);
        fanController.setCommands(2, ceilingFanHigh, ceilingFanOff);

        fanController.onButtonWasPushed(0);
        fanController.onButtonWasPushed(1);
        fanController.onButtonWasPushed(2);
        fanController.offButtonWasPushed(2);
        System.out.println(fanController.toString());
        fanController.undoButtonWasPushed();
        fanController.undoButtonWasPushed();
    }
}
