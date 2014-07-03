/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setgame;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;

/**
 *
 * @author Dominik
 */
public class Gui {

    static int setCount = 0;
    static int maxPlayers = 6;
    static String[] playerNames;

    public void initGui() {

        // GUI Elements, Settings --------------------------------------------------------------------------------
        final JDialog d1 = GuiMakeMethods.dialogMaker("Set Card Game", 20, 20, 240, 300, true, true, false, null);
        final JComboBox cbPlayerCount = GuiMakeMethods.comboBoxMaker(d1, 10, 10, 200, 20);
        final JTextField[] tfPlayernames = GuiMakeMethods.textFieldArrayMaker(d1, maxPlayers, 10, 10, 40, 200, 20);
        final JButton btnStart = GuiMakeMethods.buttonMaker(d1, "Start", 10, 40 + (30 * maxPlayers), 200, 20);

        //GUI Elements, Main Window ------------------------------------------------------------------------------
        final JFrame game = GuiMakeMethods.frameMaker("Set Card Game", 400, 20, 700, 400, false, true, null);
        final JPanel pDeck = GuiMakeMethods.panelMaker(game, 50, 50, 250, 250, new GridLayout(5, 3));

        final JToggleButton[] tbDeck = GuiMakeMethods.toggleButtonArrayMaker(pDeck, 15, 0, 0, 0, 100, 30);

        //GUI Elements, PlayerPanel ------------------------------------------------------------------------------
        final JPanel outputPanel = GuiMakeMethods.panelMaker(game, 360, 50, 300, 240, new GridLayout(2, 3));
    //Border myBorder = outputPanel.getBorder();
        //Border margin = new LineBorder(Color.BLACK,2);
        //outputPanel.setBorder(new CompoundBorder(myBorder, margin));

    // DropDown Player Count and Names ----------------------------------------------------------------------
        cbPlayerCount.addItem("Spieler Anzahl");
        for (int i = 0; i < maxPlayers; i++) {
            cbPlayerCount.addItem(String.valueOf(i + 1) + " Spieler");
            tfPlayernames[i].setText("Player " + (i + 1));
            tfPlayernames[i].setVisible(false);
        }
        btnStart.setVisible(false);

        // ActionListener ---------------------------------------------------------------------------------------
        ActionListener al = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == cbPlayerCount) {
                    for (int i = 0; i < maxPlayers; i++) {
                        tfPlayernames[i].setVisible(false);
                        btnStart.setVisible(false);
                    }
                    if (cbPlayerCount.getSelectedIndex() != 0) {
                        btnStart.setVisible(true);
                        int i;
                        for (i = 0; i < cbPlayerCount.getSelectedIndex(); i++) {
                            tfPlayernames[i].setVisible(true);
                        }
                        btnStart.setBounds(10, 40 + (30 * i), 200, 20);
                    }
                }
                if (e.getSource() == btnStart) {
                    ArrayList<String> playernamelist = new ArrayList<String>();
                    for (int i = 0; i < cbPlayerCount.getSelectedIndex(); i++) {
                        playernamelist.add(tfPlayernames[i].getText());
                    }
                    playerNames = (String[]) playernamelist.toArray(new String[playernamelist.size()]);
                    outputPanel.removeAll();
                    initGame(outputPanel, playerNames);
                    d1.setVisible(false);
                    game.setVisible(true);
                }

                if (e.getSource().getClass().getName().equals("javax.swing.JToggleButton")) {
                    if (((AbstractButton) e.getSource()).isSelected() == true) {
                        setCountFunc((JToggleButton) e.getSource());
                    }
                }
            }
        };
        cbPlayerCount.addActionListener(al);
        btnStart.addActionListener(al);
        for (int i = 0; i < tbDeck.length; i++) {
            tbDeck[i].addActionListener(al);
        }
        d1.repaint();

    }

//Other Functions -----------------------------------------------------------------------------------------
    static void drawCard(String Color, String Form, int number, JToggleButton[] tbDeck) {
    //JPanel pCard = new GuiMakeMethods(game, 400, 50, 100, 120, null)
        //wie ist es sinnig die Karten zu erstellen?
        //tbDeck[]
    }

    static void initGame(JPanel outputPanel, String[] playerNames) {
        System.out.println(playerNames.length);

        final JPanel pPlayer[] = GuiMakeMethods.panelArrayMaker(outputPanel, playerNames.length, 0, 0, 0, 100, 120, null);
        Border margin = new LineBorder(Color.BLACK, 2);

        for (int i = 0; i < pPlayer.length; i++) {
            Border myBorder = pPlayer[i].getBorder();
            pPlayer[i].setBorder(new CompoundBorder(myBorder, margin));
            final JLabel jlPlayer = GuiMakeMethods.labelMaker(pPlayer[i], playerNames[i], 20, 10, 100, 20);
            final JLabel jlPoints = GuiMakeMethods.labelMaker(pPlayer[i], "Punkte", 20, 80, 100, 20);
            final JButton btnSet = GuiMakeMethods.buttonMaker(pPlayer[i], "SET", 10, 40, 80, 30);
            btnSet.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                }
            });
        }
    }

    static void setCountFunc(JToggleButton jtbutton) {
        int count = 0;
        Component[] siblings = jtbutton.getParent().getComponents();
        for (int i = 0; i < siblings.length; i++) {
            if (((AbstractButton) siblings[i]).isSelected() == true) {
                count++;
            }
        }
        if (count == 3) {
            System.out.println("3 Buttons ausgewählt!");
            for (int i = 0; i < siblings.length; i++) {
                ((AbstractButton) siblings[i]).setSelected(false);
            }
        }

    }
}
