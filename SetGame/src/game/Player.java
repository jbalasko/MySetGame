/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package game;

import java.io.Serializable;

/** this class implements a Player
 *
 * @author Juraj
 */
public class Player implements Serializable{
    private String name;
    private int sets;
    
    public Player(){
        this("Player");        
    }
    /** creates new <code>Player</code> instance with the name <code>s</code>
     * 
     * @param s String for the name
     */
    public Player(String s){
        name = s;
        sets = 0;
    }
    /**returns the name of this <code>Player</code>
     * 
     * @return String with the name of this player
     */
    public String getName(){
        return name;
    }
    /**increments number of sets of this <code>Player</code>
     * 
     */
    public void addSet(){
        sets++;
    }
    /** returns number of this player sets
     * 
     * @return integer with sets count
     */
    public int getSets(){
        return sets;
    }
}
