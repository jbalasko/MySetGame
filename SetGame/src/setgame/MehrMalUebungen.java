

package setgame;

import javax.swing.*;        
 
public class MehrMalUebungen extends JFrame{

    public void paint(Graphics g) {
    Dimension d = this.getPreferredSize();
    int fontSize = 20;

    g.setFont(new Font("TimesRoman", Font.PLAIN, fontSize));
     
    g.setColor(Color.red);
    
    g.drawString("www.java2s.com", 10, 20);
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