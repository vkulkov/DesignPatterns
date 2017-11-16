package com.lesson_12;

import com.lesson_12.mvc.controller.ControllerInterface;
import com.lesson_12.mvc.controller.HeartController;
import com.lesson_12.mvc.model.HeartModel;
import com.lesson_12.mvc.model.HeartModelInterface;

public class HeartTest {
    public static void main(String[] args) {
        HeartModelInterface heart = new HeartModel();
        ControllerInterface controller = new HeartController(heart);
    }
}
