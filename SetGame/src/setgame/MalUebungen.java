/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package setgame;

import javax.swing.SwingUtilities;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.BorderFactory;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 *
 * @author Dominik
 */
public class MalUebungen {
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI(); 
            }
        });
    }

    private static void createAndShowGUI() {
        System.out.println("Created GUI on EDT? "+
        SwingUtilities.isEventDispatchThread());
        JFrame f = new JFrame("Swing Paint Demo");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new MyPanel());
        f.pack();
        f.setVisible(true);
    }
}

class MyPanel extends JPanel {
	
    public MyPanel() {
        setBorder(BorderFactory.createLineBorder(Color.black));
    }

    public Dimension getPreferredSize() {
        return new Dimension(450,450);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);       

        for (int i = 0; i < 4; i++) {
        	
        	g.drawRoundRect(10, 10, 150, 200, 10, 10);
			
		}
        
        
        
        g.drawRoundRect(10, 220, 150, 200, 10, 10);
        //g.drawRoundRect(120, 10, 100, 150, 10, 10);
        //g.drawRoundRect(120, 170, 100, 150, 10, 10);
        
        int[] rauteX = {0,50,100,50}; // Raute
        int[] rauteY = {25,0,25,50}; // Raute
        //g.drawPolygon(rauteX, rauteY, 4);
      
        int[] polyX = {0,2,6,10,17,22,28,38,47,56,66,77,83,89,94,102,103,103,98,90,82,74,65,52,47,40,31,25,19,14,8,4,2};
        int[] polyY = {30,25,18,13,9,6,5,6,9,12,15,12,9,5,2,7,15,25,35,43,46,48,49,45,43,42,44,48,51,53,52,46,42};
        
        int xOffset, yOffset;
        xOffset =10;
        yOffset =10;
        
        g.drawPolygon(polyX, polyY, 33);
        
        //g.drawLine(polyX[0], polyY[0], polyX[1], polyY[1]);
        
        for (int i = 0; i < polyY.length; i++) {
			//g.drawLine(polyX[i], polyY[i], polyX[i], polyY[i]);
//			polyX[i] +=10;
//        	polyY[i] +=10;	
		}
        
        //g.drawPolygon(polyX, polyY, 33);
        
//        int max_y = this.getHeight()-1;
//        int seg_i = 15;
//        int inc_x = this.getWidth()/seg_i;
//        int inc_y = this.getHeight()/seg_i;
//        g.setColor(Color.PINK);
//        for(int i=0; i<seg_i; i++){
//          g.drawLine(0, i*inc_y, (i+1)*inc_x, max_y);
//        }

        
    }  
}
