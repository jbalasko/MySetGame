/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package game;

import java.io.Serializable;
import java.util.*;

/** This Singleton class implements the actual "Set Game" game instance,
 * to create an instance of a game call getGame() method
 * 
 *
 * @author Juraj
 */
public class Game implements Serializable{
    private static Game instance = null;
    private static Settings settings;
    //array of players for this game
    private final LinkedHashSet<Player> players;
    //deck of cards for this game
    private ArrayList<SetCard> cardDeck;
    //cards on the game table
    private ArrayList<SetCard> cardTable;
    //set candidate
    private ArrayList<SetCard> cardSet;
    
    /** creates the first and only instance of <code>Game</code>
     * and initialize all fields
     * 
     */
    protected Game(){
        settings = Settings.getSettings();
        //get players
        players = Settings.getPlayers();
        //initialize cardDeck
        cardDeck = new ArrayList<>();
        if (Settings.getSingleColor() == null) createDefaultDeck();
        else createSingleColorDeck();
        //initialize cardTable
        cardTable = new ArrayList<>();
        shuffle(cardDeck);
        for(int i=0; i<12; i++) dealCard();
        //now should follow setCheck / update  
    }
    /** returns this instance of <code>Game</code>
     * 
     * @return this game
     */
    public static Game getGame(){
        if (instance == null) instance = new Game();
        return instance;
    }
    /** creates the default, 3-color cardDeck
     * 
     */
    private void createDefaultDeck(){
        if (!cardDeck.isEmpty()) cardDeck.clear();
        for (int sym=0; sym<3; sym++){
            for (int num=0; num<3; num++){
                for (int col=0; col<3; col++){
                    for (int sha=0;sha<3;sha++){
                        cardDeck.add(new SetCard(sym,num,col,sha));
                    }
                }
            }
        }
    }
    /** creates simplified one-color cardDeck
     * 
     */
    private void createSingleColorDeck(){
        if (!cardDeck.isEmpty()) cardDeck.clear();
        for (int sym=0; sym<3; sym++){
            for (int num=0; num<3; num++){
                for (int col=0; col<3; col++){
                    for (int sha=0;sha<3;sha++){
                        cardDeck.add(new SetCard(sym,num,sha));
                    }
                }
            }
        }
    }
    private void shuffle(ArrayList<SetCard> cardDeck){
        //todo 
    }
    /** deals a new <code>SetCard</code> from cardDeck into cardTable
     * 
     */
    public void dealCard(){
       //todo 
    }
    /** deals a new <code>SetCard</code> from cardDeck into position 
     * at position index in cardTable
     * 
     * @param index specifies position in ArrayList cardDeck
     */
    public void dealCard(int index){
        //todo
    }
    public int getPlayerCount(){
        return players.size();
    }
    
}
