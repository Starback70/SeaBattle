package ru.izotov.game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class SeaBattle {

    JFrame frame;
    Canvas canvas;

    static final int CELL_SIZE = 40;
    static final int FIELD_WIDTH = CELL_SIZE * 30;
    static final int FIELD_HEIGHT = CELL_SIZE * 16;

    int key;


    void go() {
        frame = new JFrame("Sea Battle");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(FIELD_WIDTH, FIELD_HEIGHT);
//        frame.setLocationRelativeTo(null);
        frame.setResizable(false);

        canvas = new Canvas();
        canvas.setBackground(Color.CYAN);

        frame.getContentPane().add(BorderLayout.CENTER, canvas);
        frame.addKeyListener(new KeyAdapter() {
            //@Override
            public void keyPressed(KeyEvent e) {
                key = e.getKeyCode();
                System.out.println(key);
            }
        });
        frame.setVisible(true);

    }
}
