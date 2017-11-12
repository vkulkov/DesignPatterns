package com.lesson_6.controller.command.stereo;

import com.lesson_6.controller.Command;
import com.lesson_6.controller.receiver.Stereo;

public class StereoOnCommand implements Command {
	private Stereo stereo;

	public StereoOnCommand(Stereo stereo) {
		this.stereo = stereo;
	}

	public void execute() {
		stereo.on();
	}

	public void undo() {
		stereo.off();
	}
}
