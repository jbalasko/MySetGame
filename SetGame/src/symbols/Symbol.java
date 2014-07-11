/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package symbols;

import java.io.Serializable;

/**
 *
 * @author Juraj
 */
public abstract class Symbol implements Serializable{
    @Override
    public abstract String toString();
}