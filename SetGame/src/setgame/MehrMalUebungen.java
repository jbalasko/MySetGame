

package setgame;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.*;        
 
public class MehrMalUebungen extends JToggleButton{

    public void paint(Graphics g) {
    Dimension d = this.getPreferredSize();
    int fontSize = 20;

    g.setFont(new Font("TimesRoman", Font.PLAIN, fontSize));
     
    g.setColor(Color.red);
    
    g.drawString("test", 10, 20);
  }
    
    
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("HelloWorldSwing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JToggleButton tButton = new JToggleButton();
        frame.getContentPane().add(tButton);
 
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
 
    public static void main(String[] args) {
        
        createAndShowGUI();
      
    }
}