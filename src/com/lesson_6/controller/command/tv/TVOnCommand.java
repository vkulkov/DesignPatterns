package com.lesson_6.controller.command.tv;

import com.lesson_6.controller.Command;
import com.lesson_6.controller.receiver.TV;

public class TVOnCommand implements Command {
	private TV tv;

	public TVOnCommand(TV tv) {
		this.tv= tv;
	}

	public void execute() {
		tv.on();
		tv.setInputChannel();
	}

	public void undo() {
		tv.off();
	}
}
