package com.lesson_6.controller.command.ceiling;

import com.lesson_6.controller.Command;
import com.lesson_6.controller.receiver.CeilingFan;

public class CeilingFanLowCommand implements Command {
    private CeilingFan ceilingFan;
    private int prevSpeed;

    public CeilingFanLowCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.low();
    }

    @Override
    public void undo() {
        switch (prevSpeed) {
            case CeilingFan.HIGH:
                ceilingFan.high();
                break;
            case CeilingFan.MEDIUM:
                ceilingFan.medium();
                break;
            case CeilingFan.OFF:
                ceilingFan.off();
                break;
            default:
        }
    }
}
