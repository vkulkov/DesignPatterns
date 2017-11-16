package com.lesson_12.mvc.view;

import com.lesson_12.mvc.controller.ControllerInterface;
import com.lesson_12.mvc.model.BeatModelInterface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DJView implements ActionListener, BeatObserver, BPMObserver {
    private BeatModelInterface model;
    private ControllerInterface controller;

    private JFrame viewFrame;
    private JPanel viewPanel;
    private BeatBar beatBar;
    private JLabel bpmOutputLabel;

    private JFrame controlFrame;
    private JPanel controlPanel;
    private JLabel bpmLabel;
    private JTextField bpmTextField;
    private JButton setBPMButton;
    private JButton increaseBPMButton;
    private JButton decreaseBPMButton;
    private JMenuBar menuBar;
    private JMenu menu;
    private JMenuItem startMenuItem;
    private JMenuItem stopMenuItem;

    public DJView(BeatModelInterface model, ControllerInterface controller) {
        this.model = model;
        this.controller = controller;
        model.registerObserver((BeatObserver) this);
        model.registerObserver((BPMObserver) this);
    }

    public void createView() {
        beatBar = new BeatBar();
        beatBar.setValue(0);

        bpmOutputLabel = new JLabel("offline", SwingConstants.CENTER);

        JPanel bpmPanel = new JPanel(new GridLayout(2, 1));
        bpmPanel.add(beatBar);
        bpmPanel.add(bpmOutputLabel);

        viewPanel = new JPanel(new GridLayout(1, 2));
        viewPanel.add(bpmPanel);

        viewFrame = new JFrame("View");
        viewFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        viewFrame.setSize(new Dimension(100, 80));
        viewFrame.getContentPane().add(viewPanel, BorderLayout.CENTER);
        viewFrame.pack();
        viewFrame.setVisible(true);
    }


    public void createControls() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        controlFrame = new JFrame("Control");

            menuBar = new JMenuBar();
            controlFrame.setJMenuBar(menuBar);

            menu = new JMenu("DJ Control");
            menuBar.add(menu);

            startMenuItem = new JMenuItem("Start");
            startMenuItem.addActionListener(event -> controller.start());
            menu.add(startMenuItem);

            stopMenuItem = new JMenuItem("Stop");
            stopMenuItem.addActionListener(event -> controller.stop());
            menu.add(stopMenuItem);

            JMenuItem exit = new JMenuItem("Quit");
            exit.addActionListener(event -> System.exit(0));
            menu.add(exit);

            controlPanel = new JPanel(new GridLayout(1, 2));
            controlFrame.getContentPane().add(controlPanel, BorderLayout.CENTER);

            JPanel insideControlPanel = new JPanel(new GridLayout(3, 1));
            controlPanel.add(insideControlPanel);

            JPanel enterPanel = new JPanel(new GridLayout(1, 2));
            insideControlPanel.add(enterPanel);

            bpmLabel = new JLabel("Enter BPM:", SwingConstants.RIGHT);
            bpmLabel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
            enterPanel.add(bpmLabel);

            bpmTextField = new JTextField(2);
            enterPanel.add(bpmTextField);

            setBPMButton = new JButton("Set");
            setBPMButton.setSize(new Dimension(10,40));
            setBPMButton.addActionListener(this);
            insideControlPanel.add(setBPMButton);

            JPanel buttonPanel = new JPanel(new GridLayout(1, 2));
            insideControlPanel.add(buttonPanel);

            decreaseBPMButton = new JButton("<<");
            decreaseBPMButton.addActionListener(this);
            buttonPanel.add(decreaseBPMButton);

            increaseBPMButton = new JButton(">>");
            increaseBPMButton.addActionListener(this);
            buttonPanel.add(increaseBPMButton);

        bpmOutputLabel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        controlFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        controlFrame.setSize(new Dimension(100, 80));
        controlFrame.getRootPane().setDefaultButton(setBPMButton);
        controlFrame.pack();
        controlFrame.setVisible(true);
    }

    public void enableStopMenuItem() {
        stopMenuItem.setEnabled(true);
    }

    public void disableStopMenuItem() {
        stopMenuItem.setEnabled(false);
    }

    public void enableStartMenuItem() {
        startMenuItem.setEnabled(true);
    }

    public void disableStartMenuItem() {
        startMenuItem.setEnabled(false);
    }

    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == setBPMButton) {
            int bpm = Integer.parseInt(bpmTextField.getText());
            controller.setBPM(bpm);
        } else if (event.getSource() == increaseBPMButton) {
            controller.increaseBPM();
        } else if (event.getSource() == decreaseBPMButton) {
            controller.decreaseBPM();
        }
    }

    @Override
    public void updateBPM() {
        int bpm = model.getBPM();
        if (bpm == 0) {
            if (bpmOutputLabel != null) {
                bpmOutputLabel.setText("offline");
            }
        } else {
            if (bpmOutputLabel != null) {
                bpmOutputLabel.setText("Current BPM: " + model.getBPM());
            }
        }
    }

    @Override
    public void updateBeat() {
        beatBar.setValue(100);
    }
}
