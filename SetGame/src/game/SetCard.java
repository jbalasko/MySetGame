/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package game;
import java.io.Serializable;

/** this class is the logical gaming card and implements 
 * the <code>Serializable</code> interface for writing to file
 *
 * @author Juraj
 */
public class SetCard implements Serializable{
    private int symbol, number, color, fill;
    private boolean selected;
    
    public SetCard(){
        
    }
    /** creates <code>SetCard</code> instance with given integer values,
     * which can be used as indexes in corresponding <code>LinkedHashSet</code>
     * fields in <code>Settings</code>
     * <b>
     * @param s integer value 0 - 2 for symbol
     * @param n integer value 0 - 2 for number
     * @param c integer value 0 - 2 for color
     * @param f integer value 0 - 2 for fill
     */
    public SetCard(int s, int n, int c, int f){
        symbol = s;
        number = n;
        color = c;
        fill = f;
        selected = false;
    }
    /** registers a selection on this card according to parameter
     * 
     * @param b boolean; changes boolean value of this card 
     */
    public void setSelected(boolean b){
        if (selected != b) selected = b;
    }
    
}
