package com.lesson_12.mvc.view;

import javax.swing.*;

public class BeatBar extends JProgressBar implements Runnable {
    private Thread thread;

    public BeatBar() {
        thread = new Thread(this);
        setMaximum(100);
        thread.start();
    }

    public void run() {
        while (true) {
            int value = getValue();
            value = (int)(value * .75);
            setValue(value);
            repaint();
            try {
                Thread.sleep(50);
            } catch (InterruptedException ignored) {}
        }
    }
}
