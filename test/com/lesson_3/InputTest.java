package com.lesson_3;

import com.lesson_3.io.LowerCaseInputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {
    public static void main(String[] args) {
        int c;
        try (InputStream in = new LowerCaseInputStream(
                new BufferedInputStream(
                        new FileInputStream("resources/com/lesson_3/io/test.txt")))) {
            while ((c = in.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
