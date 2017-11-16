package com.lesson_12;

import com.lesson_12.mvc.controller.BeatController;
import com.lesson_12.mvc.controller.ControllerInterface;
import com.lesson_12.mvc.model.BeatModel;
import com.lesson_12.mvc.model.BeatModelInterface;

public class DJTest {
    public static void main(String[] args) {
        BeatModelInterface model = new BeatModel();
        ControllerInterface controller = new BeatController(model);
    }
}
