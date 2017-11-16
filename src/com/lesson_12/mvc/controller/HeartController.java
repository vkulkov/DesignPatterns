package com.lesson_12.mvc.controller;

import com.lesson_12.mvc.model.HeartAdapter;
import com.lesson_12.mvc.model.HeartModelInterface;
import com.lesson_12.mvc.view.DJView;

public class HeartController implements ControllerInterface {
    private HeartModelInterface heart;
    private DJView view;

    public HeartController(HeartModelInterface heart) {
        this.heart = heart;
        view = new DJView(new HeartAdapter(heart), this);
        view.createView();
        view.createControls();
        view.disableStopMenuItem();
        view.disableStartMenuItem();
    }

    @Override
    public void start() {}

    @Override
    public void stop() {}

    @Override
    public void increaseBPM() {}

    @Override
    public void decreaseBPM() {}

    @Override
    public void setBPM(int bpm) {}
}
