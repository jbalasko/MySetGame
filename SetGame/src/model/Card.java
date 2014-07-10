/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Dominik
 */
public class Card {

    // optical attributes of a card
    private CardColor color;
    private Filling filling;
    private Shape shape;
    private int shapeAmount;

    // logical attributes
    private CardStatus cardStatus;

    public Card(CardColor color, Filling filling, Shape shape, int shapeAmount) {
        this.color = color;
        this.filling = filling;
        this.shape = shape;
        this.shapeAmount = shapeAmount;
        this.cardStatus = CardStatus.INSTACK; //after creating every card is in the stack
    }

    public CardColor getColor() {
        return color;
    }

    public Filling getFilling() {
        return filling;
    }

    public Shape getShape() {
        return shape;
    }

    public int getShapeAmount() {
        return shapeAmount;
    }

    public CardStatus getCardStatus() {
        return cardStatus;
    }

    // only setter for status, as other attributes we never change
    public void setCardStatus(CardStatus cardStatus) {
        this.cardStatus = cardStatus;
    }

}
