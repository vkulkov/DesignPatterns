package com.lesson_6.controller.command.hottub;

import com.lesson_6.controller.Command;
import com.lesson_6.controller.receiver.HotTub;

public class HottubOffCommand implements Command {
	private HotTub hottub;

	public HottubOffCommand(HotTub hottub) {
		this.hottub = hottub;
	}

	public void execute() {
		hottub.setTemperature(98);
		hottub.off();
	}
	public void undo() {
		hottub.on();
	}
}
