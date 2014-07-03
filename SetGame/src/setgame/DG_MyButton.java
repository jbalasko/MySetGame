package setgame;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JToggleButton;

public class DG_MyButton extends JToggleButton{

        private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("HelloWorldSwing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(null);
        
        DG_MyButton drawButton = new DG_MyButton();
        //drawButton.setBounds(10, 10, 100, 200);
        
        frame.getContentPane().add(drawButton);
        frame.setVisible(true);
        }
    
        @Override
  public void paintComponent(Graphics g) {   
        super.paintComponent(g);
        //g.drawString("test test test", 50, 50);
         int[] polyX = {0,2,6,10,17,22,28,38,47,56,66,77,83,89,94,102,103,103,98,90,82,74,65,52,47,40,31,25,19,14,8,4,2};
        int[] polyY = {30,25,18,13,9,6,5,6,9,12,15,12,9,5,2,7,15,25,35,43,46,48,49,45,43,42,44,48,51,53,52,46,42};
        g.drawPolygon(polyX, polyY, 33);
    }
  
      public static void main(String[] args) {
        
        createAndShowGUI();
      
    }
  
}