package com.lesson_6.controller;

import com.lesson_6.controller.command.NoCommand;

import java.util.Arrays;

public class RemoteController {
    private Command[] onCommands;
    private Command[] offCommands;
    private Command lastCommand;

    public RemoteController(int numberOfSlots) {
        onCommands = new Command[numberOfSlots];
        offCommands = new Command[numberOfSlots];
        lastCommand = new NoCommand();

        for (int i = 0; i < numberOfSlots; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    public void setCommands(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        if (!lastCommand.equals(onCommands[slot])) {
            onCommands[slot].execute();
            lastCommand = onCommands[slot];
        }
    }

    public void offButtonWasPushed(int slot) {
        if (!lastCommand.equals(offCommands[slot])) {
            offCommands[slot].execute();
            lastCommand = offCommands[slot];
        }
    }

    public void undoButtonWasPushed() {
        lastCommand.undo();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n------Remote Control------\n");
        for (int i = 0; i < onCommands.length; i++) {
            sb.append(String.format("[slot %d] %s   %s%n", i,
                    onCommands[i].getClass().getSimpleName(), onCommands[i].getClass().getSimpleName()));
        }
        sb.append(String.format("[undo] %s%n", lastCommand.getClass().getSimpleName()));
        return sb.toString();
    }
}
