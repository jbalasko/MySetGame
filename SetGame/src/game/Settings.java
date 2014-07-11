/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package game;
import symbols.Symbol;
import symbols.Oval;
import symbols.Rectangle;
import symbols.Wave;
import java.util.*;
import java.io.Serializable;
import java.awt.Color;
import exceptions.*;

/** this Singleton implements settings for actual game instance with static
 fields players, symbols, colors, singleColor
 *
 * @author Juraj
 */
public class Settings implements Serializable{
    private static Settings instance;
    private static Set<Player> players;
    private static Set<Symbol> symbols;
    private static Set<Color> colors;
    private static Color singleColor;
    
    /** *  creates <code>Settings</code> instance with default values:
     * <b>
 players: Player 1, Player 2
 symbols: Rectangle, Wave, Oval
 colors: Red, Green, Blue
 singleColor: null
     */ 
    protected Settings(){
        players = new LinkedHashSet<>();
        players.add(new Player("Player 1"));
        players.add(new Player("Player 2"));
        symbols = new LinkedHashSet<>();
        symbols.add(new Rectangle());
        symbols.add(new Wave());
        symbols.add(new Oval());
        colors = new LinkedHashSet<>();
        colors.add(Color.RED);
        colors.add(Color.GREEN);
        colors.add(Color.BLUE);
        singleColor = null;
    }
    /** returns the only instance of <code>Settings</code>
     * 
     * @return this instance
     */
    public static Settings getSettings(){
        if (instance == null) instance = new Settings();
        return instance;
    }
    /** clears the <code>LinkedHashSet<E></code> field players,
     * the list will be empty
     */ 
    public void deletePlayers(){
        players.clear();
    }
    /** adds a new player in the list for game instance
     * You should delete all players prior to adding your custom players
     * 
     * @param s String with a name of the player to be added
     * @throws SettingsException
     */
    public void addPlayer(String s) throws SettingsException{
        if (s!=null) players.add(new Player(s));
        else throw new SettingsException("Player name not set - NULL Pointer!");
    }
    public static void addAllPlayers(Set<Player> p)
            throws SettingsException{
        if (p!= null && p.size() >= 1) {
            players.clear();
            for (Object o:p) players.add(new Player(((Player)o).getName()));
        }
        else throw new SettingsException("Players must be valid LinkedHashSet "
                + "of one or more players");
    }
    /** returns the <code>LinkedHashSet<E></code> with players
     * 
     * @return <code>LinkedHashSet<E></code> players field
     */
    public static Set<Player> getPlayers(){
        return players;
    }
    /** registers symbols for game instance
     * 
     * @param a must be an <code>LinkedHashSet<E></code> 
     * with 3 elements/symbols
     * @throws SettingsException
     */
    public static void setSymbols (Set<Symbol> a) 
            throws SettingsException{
        if (a.size()==3) {
            symbols.clear();
            for (Object o:a) symbols.add((Symbol)o);
        }
        else throw new SettingsException("Shapes must be 3 unique types");
    }
    /** returns the <code>LinkedHashSet<E></code> with symbols for game instance
     * 
     * @return <code>LinkedHashSet<E></code> symbols field
     */
    public static Set<Symbol> getSymbols(){
        return symbols;
    }
    /** registers colors for game instance
     * 
     * @param c must be an <code>LinkedHashSet<E></code> 
     * with 3 elements/colors
     * @throws SettingsException
     */
    public static void setColors (Set<Color> c) 
            throws SettingsException{
        if (c.size()==3) {
            colors.clear();
            for (Object o:c) colors.add((Color)o);
        }
        else throw new SettingsException("Colors must be 3 unique Color types");
    }
    /** returns the <code>LinkedHashSet<E></code> with colors
     * 
     * @return <code>LinkedHashSet<E></code> colors field
     */
    public static Set<Color> getColors(){
        return colors;
    }
    /** registers single color for game instance and allows simplified game
     * with only one color for cards
     * 
     * @param c must be valid and of type Color
     * @throws SettingsException 
     */
    public static void setSingleColor(Color c) throws SettingsException{
        if (c!=null) singleColor = c;
        else throw new SettingsException("Color must be valid type of Color");
    }
    /** returns single color as <code>Color</code> type for game instance or
     * null when it was not set
     * 
     * @return <code>Color</code> singleColor value or null pointer when not set
     */
    public static Color getSingleColor(){
        return singleColor;
    }
    /** deletes singleColor value and enables default colors in game
     * 
     */
    public static void disableSingleColor(){
        singleColor = null;
    }
}
