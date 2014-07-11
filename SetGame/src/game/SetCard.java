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
    private int symbol, number, color, shade;
    private boolean selected;
    
    public SetCard(){
        
    }
    /** creates <code>SetCard</code> instance with given integer values,
     * which can be used as indexes in corresponding <code>LinkedHashSet</code>
     * fields in <code>Settings</code>
     * <b>
     * @param sym integer value 0 - 2 for symbol
     * @param num integer value 0 - 2 for number
     * @param col integer value 0 - 2 for color
     * @param sha integer value 0 - 2 for fill
     */
    public SetCard(int sym, int num, int col, int sha){
        symbol = sym;
        number = num;
        color = col;
        shade = sha;
        selected = false;
    }
    /** creates <code>SetCard</code> instance with given integer values,
     * which can be used as indexes in corresponding <code>LinkedHashSet</code>
     * fields in <code>Settings</code> AND single color only !
     * The color is alway set 0.
     * All other logic should function unmodified,
     * use <code>Settings.singleColor</code> to check if single color mode is set
     * <b>
     * @param sym integer value 0 - 2 for symbol
     * @param num integer value 0 - 2 for number
     * @param sha integer value 0 - 2 for fill
     */
    public SetCard(int sym, int num, int sha){
        this(sym,num,0,sha);
    }
    /** registers a selection on this card according to parameter
     * 
     * @param b boolean; changes boolean value of this card 
     */
    public void setSelected(boolean b){
        if (selected != b) selected = b;
    }
    
}
