package com.lesson_5.advanced;

public class MyThread implements Runnable {
    @Override
    public void run() {
        MyClass myClass = MyClass.getInstance();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println(myClass);
        }
    }
}
