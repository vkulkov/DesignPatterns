package com.lesson_12.mvc.model;

import com.lesson_12.mvc.view.BPMObserver;
import com.lesson_12.mvc.view.BeatObserver;

public interface HeartModelInterface {
	int getHeartRate();
	void registerObserver(BeatObserver o);
	void removeObserver(BeatObserver o);
	void registerObserver(BPMObserver o);
	void removeObserver(BPMObserver o);
}
