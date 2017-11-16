package com.lesson_12.mvc.model;

import com.lesson_12.mvc.view.BPMObserver;
import com.lesson_12.mvc.view.BeatObserver;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HeartModel implements HeartModelInterface, Runnable {
	private List<BeatObserver> beatObservers = new ArrayList<>();
	private List<BPMObserver> bpmObservers = new ArrayList<>();
	private int time = 1000;
    private int bpm = 90;
	private Random random = new Random(System.currentTimeMillis());

	public HeartModel() {
		new Thread(this).start();
	}

	public void run() {
		int lastRate = -1;

		while (true) {
			int change = random.nextInt(10);
			if (random.nextInt(2) == 0) {
				change = 0 - change;
			}
			int rate = 60000/(time + change);
			if (rate < 120 && rate > 50) {
				time += change;
				notifyBeatObservers();
				if (rate != lastRate) {
					lastRate = rate;
					notifyBPMObservers();
				}
			}
			try {
				Thread.sleep(time);
			} catch (InterruptedException ignored) {}
		}
	}
	public int getHeartRate() {
		return 60000/time;
	}

	public void registerObserver(BeatObserver o) {
		beatObservers.add(o);
	}

	public void removeObserver(BeatObserver o) {
		int i = beatObservers.indexOf(o);
		if (i >= 0) {
			beatObservers.remove(i);
		}
	}

	private void notifyBeatObservers() {
		for (BeatObserver observer : beatObservers) {
			observer.updateBeat();
		}
	}

	public void registerObserver(BPMObserver o) {
		bpmObservers.add(o);
	}

	public void removeObserver(BPMObserver o) {
		int i = bpmObservers.indexOf(o);
		if (i >= 0) {
			bpmObservers.remove(i);
		}
	}

	private void notifyBPMObservers() {
		for (BPMObserver observer : bpmObservers) {
			observer.updateBPM();
		}
	}
}
