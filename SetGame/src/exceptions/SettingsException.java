/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exceptions;

/**
 *
 * @author Juraj
 */
public class SettingsException extends Exception{
    public SettingsException(){
        super();
    }
    public SettingsException(String s){
        super(s);
    }
}