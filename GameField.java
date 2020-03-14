package ru.izotov.game;

import java.awt.*;

import static ru.izotov.game.SeaBattle.CELL_SIZE;

public class GameField {
    void paintField(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(2));
        g2.setColor(Color.black);
        int start1 = 2;
        int end1 = start1 + 10;
        int start2 = end1 + 3;
        int end2 = start2 + 10;
        for (int i = 1; i <= 11; i++) {
            g2.drawLine(CELL_SIZE * (i + start1 - 1), CELL_SIZE * start1, CELL_SIZE * (i + start1 - 1), CELL_SIZE * end1);
            g2.drawLine(CELL_SIZE * start1, CELL_SIZE * (i + start1 - 1), CELL_SIZE * end1, CELL_SIZE * (i + start1 - 1));
        }
        for (int i = 1; i <= 11; i++) {
            g2.drawLine(CELL_SIZE * (i + start2 - 1), CELL_SIZE * start1, CELL_SIZE * (i + start2 - 1), CELL_SIZE * end1);
            g2.drawLine(CELL_SIZE * start2, CELL_SIZE * (i + start1 - 1), CELL_SIZE * end2, CELL_SIZE * (i + start1 - 1));
        }
        g2.setFont(new Font("Verdana", 0, CELL_SIZE * 2 / 3));
        int litera1Y = start1 * CELL_SIZE - CELL_SIZE / 2 + CELL_SIZE / 4;

        g2.drawString("A",
                start1 * CELL_SIZE + CELL_SIZE * 1 / 2 - CELL_SIZE / 4,
                litera1Y);
        g2.drawString("Б",
                start1 * CELL_SIZE + CELL_SIZE * 3 / 2 - CELL_SIZE / 4,
                litera1Y);
        g2.drawString("В",
                start1 * CELL_SIZE + CELL_SIZE * 5 / 2 - CELL_SIZE / 4,
                litera1Y);
        g2.drawString("Г",
                start1 * CELL_SIZE + CELL_SIZE * 7 / 2 - CELL_SIZE / 4,
                litera1Y);
        g2.drawString("Д",
                start1 * CELL_SIZE + CELL_SIZE * 9 / 2 - CELL_SIZE / 4,
                litera1Y);
        g2.drawString("Е",
                start1 * CELL_SIZE + CELL_SIZE * 11 / 2 - CELL_SIZE / 4,
                litera1Y);
        g2.drawString("Ж",
                start1 * CELL_SIZE + CELL_SIZE * 13 / 2 - CELL_SIZE / 4,
                litera1Y);
        g2.drawString("З",
                start1 * CELL_SIZE + CELL_SIZE * 15 / 2 - CELL_SIZE / 4,
                litera1Y);
        g2.drawString("И",
                start1 * CELL_SIZE + CELL_SIZE * 17 / 2 - CELL_SIZE / 4,
                litera1Y);
        g2.drawString("К",
                start1 * CELL_SIZE + CELL_SIZE * 19 / 2 - CELL_SIZE / 4,
                litera1Y);

        g2.drawString("A",
                start1 * CELL_SIZE + CELL_SIZE * 1 / 2 - CELL_SIZE / 4 + CELL_SIZE * 13,
                litera1Y);
        g2.drawString("Б",
                start1 * CELL_SIZE + CELL_SIZE * 3 / 2 - CELL_SIZE / 4 + CELL_SIZE * 13,
                litera1Y);
        g2.drawString("В",
                start1 * CELL_SIZE + CELL_SIZE * 5 / 2 - CELL_SIZE / 4,
                litera1Y);
        g2.drawString("Г",
                start1 * CELL_SIZE + CELL_SIZE * 7 / 2 - CELL_SIZE / 4,
                litera1Y);
        g2.drawString("Д",
                start1 * CELL_SIZE + CELL_SIZE * 9 / 2 - CELL_SIZE / 4,
                litera1Y);
        g2.drawString("Е",
                start1 * CELL_SIZE + CELL_SIZE * 11 / 2 - CELL_SIZE / 4,
                litera1Y);
        g2.drawString("Ж",
                start1 * CELL_SIZE + CELL_SIZE * 13 / 2 - CELL_SIZE / 4,
                litera1Y);
        g2.drawString("З",
                start1 * CELL_SIZE + CELL_SIZE * 15 / 2 - CELL_SIZE / 4,
                litera1Y);
        g2.drawString("И",
                start1 * CELL_SIZE + CELL_SIZE * 17 / 2 - CELL_SIZE / 4,
                litera1Y);
        g2.drawString("К",
                start1 * CELL_SIZE + CELL_SIZE * 19 / 2 - CELL_SIZE / 4,
                litera1Y);

    }
}
