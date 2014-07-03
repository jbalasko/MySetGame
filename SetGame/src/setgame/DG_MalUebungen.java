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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dominik
 */
public class DG_MalUebungen {
    
    public static void main(String[] args) {
         JFrame f = new JFrame("Swing Paint Demo");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyPanel m1 = new MyPanel();
        f.add(m1);
        f.setVisible(true);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(DG_MalUebungen.class.getName()).log(Level.SEVERE, null, ex);
        }
        Graphics g1 = m1.getGraphics(); //hier den ToggleButton abgreifen
       // g1.clearRect(0, 0, 150, 150);
        g1.setColor(Color.red);
        g1.fillRect(40, 40, 20, 20);
//        g1.drawString("HELLO", 50, 50);
        f.repaint();
        f.pack(); 
        for(int i = 0; i<10; i++){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(DG_MalUebungen.class.getName()).log(Level.SEVERE, null, ex);
        }
        m1.getGraphics().clearRect(0, 0, i*30, i*30);
    }
 
    }
}



class MyPanel extends JPanel {
	
    boolean teat = true;
    public MyPanel() {
        setBorder(BorderFactory.createLineBorder(Color.black));
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(450,450);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);       

        for (int i = 0; i < 4 && teat; i++) {
        	
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
        int abstand = 50;
        for (int i = 0; i < 5; i++) {
        int[] polyX2 = {0,2,6,10,17,22,28,38,47,56,66,77,83,89,94,102,103,103,98,90,82,74,65,52,47,40,31,25,19,14,8,4,2};
        int[] polyY2 = {(i*abstand)+30,(i*abstand)+25,(i*abstand)+18,(i*abstand)+13,(i*abstand)+9,(i*abstand)+6,(i*abstand)+5,(i*abstand)+6,(i*abstand)+9,(i*abstand)+12,(i*abstand)+15,(i*abstand)+12,(i*abstand)+9,(i*abstand)+5,(i*abstand)+2,(i*abstand)+7,(i*abstand)+15,(i*abstand)+25,(i*abstand)+35,(i*abstand)+43,(i*abstand)+46,(i*abstand)+48,(i*abstand)+49,(i*abstand)+45,(i*abstand)+43,(i*abstand)+42,(i*abstand)+44,(i*abstand)+48,(i*abstand)+51,(i*abstand)+53,(i*abstand)+52,(i*abstand)+46,(i*abstand)+42};
g.drawPolygon(polyX2, polyY2, 33);
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
