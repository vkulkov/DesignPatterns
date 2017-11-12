package com.lesson_6.controller.command.stereo;

import com.lesson_6.controller.Command;
import com.lesson_6.controller.receiver.Stereo;

public class StereoOnWithCD implements Command {
    private Stereo stereo;

    public StereoOnWithCD(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
