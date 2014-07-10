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
public enum CardColor {
    RED, BLUE, GREEN, BLACK; //Contains every possible Color from which the user can choose
    
    
    @Override
    public String toString() {
        return this.name().toLowerCase();
    }
}
