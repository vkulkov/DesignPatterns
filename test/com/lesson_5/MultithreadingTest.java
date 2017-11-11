package com.lesson_5;

import com.lesson_5.advanced.MyThread;

public class MultithreadingTest {
    public static void main(String[] args) throws InterruptedException {
        Thread first = new Thread(new MyThread());
        Thread second = new Thread(new MyThread());
        first.start();
        second.start();
        Thread.sleep(1000);
    }
}
