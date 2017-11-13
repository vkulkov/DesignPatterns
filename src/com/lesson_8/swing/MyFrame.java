package com.lesson_8.swing;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    public MyFrame(String title) throws HeadlessException {
        super(title);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(300, 300);
        this.setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawString("I rule!!", 150, 150);
    }

    public static void main(String[] args) {
        JFrame myFrame = new MyFrame("Head First Design Patterns");
    }
}
