/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functional;

import java.util.ArrayList;
import java.util.List;
import model.*;

/**
 *
 * @author Dominik
 */
public class CardFactory {

    public static List<Card> generateCards(List<CardColor> colors, List<Filling> fillings, List<Shape> shapes) {
        List<Card> cardStack = new ArrayList<Card>();

        for (int number = 1; number <= 3; number++) {
            for (int i = 0; i <= colors.size(); i++) {
                for (int j = 0; j <= fillings.size(); j++) {
                    for (int k = 0; k <= shapes.size(); k++) {
                        Card card = new Card(colors.get(i), fillings.get(j), shapes.get(k), number);
                        cardStack.add(card);
                    }
                }
            }
        }

        // for(Color color : colors) {    
        // }
        

        return cardStack;
    }
}
