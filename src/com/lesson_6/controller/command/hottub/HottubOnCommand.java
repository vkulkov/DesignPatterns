package com.lesson_6.controller.command.hottub;

import com.lesson_6.controller.Command;
import com.lesson_6.controller.receiver.HotTub;

public class HottubOnCommand implements Command {
	private HotTub hottub;

	public HottubOnCommand(HotTub hottub) {
		this.hottub = hottub;
	}
	public void execute() {
		hottub.on();
		hottub.setTemperature(104);
		hottub.circulate();
	}
	public void undo() {
		hottub.off();
	}
}
