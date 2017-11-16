package com.lesson_12.mvc.model;

import com.lesson_12.mvc.view.BPMObserver;
import com.lesson_12.mvc.view.BeatObserver;

public interface BeatModelInterface {
    void initialize();

    void on();
    void off();

    void setBPM(int bpm);
    int getBPM();

    void registerObserver(BeatObserver o);
    void removeObserver(BeatObserver o);
    void registerObserver(BPMObserver o);
    void removeObserver(BPMObserver o);
}
