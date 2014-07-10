package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

public class DG_MyButton extends JToggleButton {

    private static void createAndShowGUI() { //funktion nur zu testzwecken, keine Verwendung in der Klasse
        JFrame frame = new JFrame("Button Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        DG_MyButton drawButton = new DG_MyButton();
        frame.add(drawButton);
        //frame.getContentPane().add(drawButton);
        frame.setVisible(true);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        //drawCard();
        
        
        //drawEmptyWave(g, 3, Color.red);
        //drawShadeWave(g, 3, Color.black);
        //drawFilledWave(g, 3, Color.black);
        //drawEmptyRect(g, 3, Color.black);
        //drawShadeRect(g, 3, Color.black);
        //drawFilledRect(g, 3, Color.black);
        //drawEmptyHeart(g, 3, Color.black);
        //drawShadeHeart(g, 3, Color.black);
        //drawFilledHeart(g, 3, Color.black);
        //drawEmptyStar(g, 3, Color.black);
        //drawShadeStar(g, 3, Color.black);
        //drawFilledStar(g, 3, Color.black);
        

        //int[] polyX = {0,2,6,10,17,22,28,38,47,56,66,77,83,89,94,102,103,103,98,90,82,74,65,52,47,40,31,25,19,14,8,4,2};
        //int[] polyY = {30,25,18,13,9,6,5,6,9,12,15,12,9,5,2,7,15,25,35,43,46,48,49,45,43,42,44,48,51,53,52,46,42};
        //g.setColor(Color.red);
        int abstand = 50;
        for (int i = 0; i < 5; i++) {
            int[] polyX = {0, 2, 6, 10, 17, 22, 28, 38, 47, 56, 66, 77, 83, 89, 94, 102, 103, 103, 98, 90, 82, 74, 65, 52, 47, 40, 31, 25, 19, 14, 8, 4, 2};
            int[] polyY = {(i * abstand) + 30, (i * abstand) + 25, (i * abstand) + 18, (i * abstand) + 13, (i * abstand) + 9, (i * abstand) + 6, (i * abstand) + 5, (i * abstand) + 6, (i * abstand) + 9, (i * abstand) + 12, (i * abstand) + 15, (i * abstand) + 12, (i * abstand) + 9, (i * abstand) + 5, (i * abstand) + 2, (i * abstand) + 7, (i * abstand) + 15, (i * abstand) + 25, (i * abstand) + 35, (i * abstand) + 43, (i * abstand) + 46, (i * abstand) + 48, (i * abstand) + 49, (i * abstand) + 45, (i * abstand) + 43, (i * abstand) + 42, (i * abstand) + 44, (i * abstand) + 48, (i * abstand) + 51, (i * abstand) + 53, (i * abstand) + 52, (i * abstand) + 46, (i * abstand) + 42};
            //g.drawPolygon(polyX, polyY, 33);
            for (int j = 0; j < 33; j++) {
                g.drawLine(polyX[j], polyY[j], polyX[j], polyY[j]);
            }

        }

    }

    public static void main(String[] args) {
        createAndShowGUI();
    }

    void drawEmptyWave(Graphics g, int count, Color c) {
        g.setColor(c);
        int abstand = 50;
        for (int i = 0; i < count; i++) {
            int[] polyX = {0, 2, 6, 10, 17, 22, 28, 38, 47, 56, 66, 77, 83, 89, 94, 102, 103, 103, 98, 90, 82, 74, 65, 52, 47, 40, 31, 25, 19, 14, 8, 4, 2};
            int[] polyY = {(i * abstand) + 30, (i * abstand) + 25, (i * abstand) + 18, (i * abstand) + 13, (i * abstand) + 9, (i * abstand) + 6, (i * abstand) + 5, (i * abstand) + 6, (i * abstand) + 9, (i * abstand) + 12, (i * abstand) + 15, (i * abstand) + 12, (i * abstand) + 9, (i * abstand) + 5, (i * abstand) + 2, (i * abstand) + 7, (i * abstand) + 15, (i * abstand) + 25, (i * abstand) + 35, (i * abstand) + 43, (i * abstand) + 46, (i * abstand) + 48, (i * abstand) + 49, (i * abstand) + 45, (i * abstand) + 43, (i * abstand) + 42, (i * abstand) + 44, (i * abstand) + 48, (i * abstand) + 51, (i * abstand) + 53, (i * abstand) + 52, (i * abstand) + 46, (i * abstand) + 42};
            g.drawPolygon(polyX, polyY, 33);
        }
    }

    void drawShadeWave(Graphics g, int count) {

    }

    void drawFilledWave(Graphics g, int count, Color c) {
        g.setColor(c);
        int abstand = 50;
        for (int i = 0; i < count; i++) {
            int[] polyX = {0, 2, 6, 10, 17, 22, 28, 38, 47, 56, 66, 77, 83, 89, 94, 102, 103, 103, 98, 90, 82, 74, 65, 52, 47, 40, 31, 25, 19, 14, 8, 4, 2};
            int[] polyY = {(i * abstand) + 30, (i * abstand) + 25, (i * abstand) + 18, (i * abstand) + 13, (i * abstand) + 9, (i * abstand) + 6, (i * abstand) + 5, (i * abstand) + 6, (i * abstand) + 9, (i * abstand) + 12, (i * abstand) + 15, (i * abstand) + 12, (i * abstand) + 9, (i * abstand) + 5, (i * abstand) + 2, (i * abstand) + 7, (i * abstand) + 15, (i * abstand) + 25, (i * abstand) + 35, (i * abstand) + 43, (i * abstand) + 46, (i * abstand) + 48, (i * abstand) + 49, (i * abstand) + 45, (i * abstand) + 43, (i * abstand) + 42, (i * abstand) + 44, (i * abstand) + 48, (i * abstand) + 51, (i * abstand) + 53, (i * abstand) + 52, (i * abstand) + 46, (i * abstand) + 42};
            g.fillPolygon(polyX, polyY, 33);
        }
    }

    void drawEmptyheart(Graphics g, int count, Color c) {
        int[] heartx = {30, 40, 50, 59, 30, 1, 10, 20};
        int[] hearty = {20, 1, 1, 20, 59, 20, 1, 1};
    }

    void drawShadeHeart(Graphics g, int count, Color c) {

    }

    void drawFilledHeart(Graphics g, int count, Color c) {

    }

    void drawEmptyStar(Graphics g, int count, Color c) {
        g.setColor(c);
        int abstand = 50;
        for (int i = 0; i < count; i++) {
            int[] starx = {50, 60, 99, 60, 50, 40, 1, 40};
            int[] stary = {(i * abstand) + 1, (i * abstand) + 40, (i * abstand) + 50, (i * abstand) + 60, (i * abstand) + 99, (i * abstand) + 60, (i * abstand) + 50, (i * abstand) + 40};
            g.drawPolygon(starx, stary, 8);
        }
    }

    void drawShadeStar(Graphics g, int count, Color c) {

    }

    void drawFilledStar(Graphics g, int count, Color c) {
        int abstand = 50;
        for (int i = 0; i < count; i++) {
            int[] starx = {50, 60, 99, 60, 50, 40, 1, 40};
            int[] stary = {(i * abstand) + 1, (i * abstand) + 40, (i * abstand) + 50, (i * abstand) + 60, (i * abstand) + 99, (i * abstand) + 60, (i * abstand) + 50, (i * abstand) + 40};
            g.fillPolygon(starx, stary, 8);
        }
    }
}
