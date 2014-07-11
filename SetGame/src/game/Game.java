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
     * 
     */
    protected Game(){
        settings = Settings.getSettings();
        players = Settings.getPlayers();
        cardDeck = new ArrayList<>();
        if (Settings.getSingleColor() == null) createDefaultDeck();
        else createSingleColorDeck();
        
        //todo initiate other fields
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
        for (int s=0; s<3; s++){
            for (int n=0; n<3; n++){
                for (int c=0; c<3; c++){
                    for (int f=0;f<3;f++) cardDeck.add(new SetCard(s,n,c,f));
                }
            }
        }
    }
    /** creates simplified one-color cardDeck
     * 
     */
    private void createSingleColorDeck(){
        
    }
    public int getPlayerCount(){
        return players.size();
    }
    
}
