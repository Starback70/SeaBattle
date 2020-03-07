package ru.izotov.game;

import java.awt.*;

import static ru.izotov.game.SeaBattle.CELL_SIZE;

public class GameField {
    void paintField(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(2));
        g2.setColor(Color.black);
        // границы поля, начало - левый верхний угол  и по часовой.
        g2.drawLine(CELL_SIZE*1,CELL_SIZE*2, CELL_SIZE*4, CELL_SIZE*2);
        g2.drawLine(CELL_SIZE*4,CELL_SIZE*2, CELL_SIZE*4, CELL_SIZE*1);
        g2.drawLine(CELL_SIZE*4,CELL_SIZE*1, CELL_SIZE*6, CELL_SIZE*1);
        g2.drawLine(CELL_SIZE*6,CELL_SIZE*1, CELL_SIZE*6, CELL_SIZE*2);
        g2.drawLine(CELL_SIZE*6,CELL_SIZE*2, CELL_SIZE*9, CELL_SIZE*2);
        g2.drawLine(CELL_SIZE*9,CELL_SIZE*2, CELL_SIZE*9, CELL_SIZE*12);
        g2.drawLine(CELL_SIZE*9,CELL_SIZE*12, CELL_SIZE*6, CELL_SIZE*12);
        g2.drawLine(CELL_SIZE*6,CELL_SIZE*12, CELL_SIZE*6, CELL_SIZE*13);
        g2.drawLine(CELL_SIZE*6,CELL_SIZE*13, CELL_SIZE*4, CELL_SIZE*13);
        g2.drawLine(CELL_SIZE*4,CELL_SIZE*13, CELL_SIZE*4, CELL_SIZE*12);
        g2.drawLine(CELL_SIZE*4,CELL_SIZE*12, CELL_SIZE*1, CELL_SIZE*12);
        g2.drawLine(CELL_SIZE*1,CELL_SIZE*12, CELL_SIZE*1, CELL_SIZE*2);
        // середина поля
        g2.drawLine(CELL_SIZE*1,CELL_SIZE*7, CELL_SIZE*9, CELL_SIZE*7);
    }
}
