/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import functional.CardFactory;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dominik
 */
public class CardStack {

    private List<Card> cardsInGame = new ArrayList<Card>();

    private List<Filling> selectedFillings = new ArrayList<Filling>(); //contains selected fillings from user
    private List<CardColor> selectedColors = new ArrayList<CardColor>(); //contains selected colors from user
    private List<Shape> selectedShapes = new ArrayList<Shape>(); //contains selected shapes from user
    //private List<ShapeAmount> selectedShapeAmount = new ArrayList<ShapeAmount>();

    public List<Card> getCardsInGame() {
        return cardsInGame;
    }

    public List<Filling> getSelectedFillings() {
        return selectedFillings;
    }

    public List<CardColor> getSelectedColors() {
        return selectedColors;
    }

    public List<Shape> getSelectedShapes() {
        return selectedShapes;
    }

    public void addFilling(Filling filling) {
        selectedFillings.add(filling);
    }

    public void addColor(CardColor color) {
        selectedColors.add(color);
    }

    public void addShape(Shape shape) {
        selectedShapes.add(shape);
    }

    public void createCards() {
        cardsInGame = CardFactory.generateCards(selectedColors, selectedFillings, selectedShapes);

    }

}
