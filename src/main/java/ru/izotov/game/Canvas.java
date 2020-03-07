package ru.izotov.game;

import javax.swing.*;
import java.awt.*;

public class Canvas extends JPanel {
    @Override
    public void paint (Graphics g){
        super.paint(g);
//        ball.paintBall(g);

        new GameField().paintField(g);

    }
}
