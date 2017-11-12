package com.lesson_6.controller.command.tv;

import com.lesson_6.controller.Command;
import com.lesson_6.controller.receiver.TV;

public class TVOffCommand implements Command {
	private TV tv;

	public TVOffCommand(TV tv) {
		this.tv= tv;
	}

	public void execute() {
		tv.off();
	}

	public void undo() {
		tv.on();
	}
}
