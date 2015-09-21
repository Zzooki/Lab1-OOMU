/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grupp2.calculator.exceptions;

/**
 *
 * @author Rasmus
 */

/**
 * @param InvalidOperationException exception that gets thrown whenever the user tries to inputs an
 * expression that has too few or to many operators/operands.
 * @author Rasmus
 */
public class InvalidOperationException extends Exception{
    
    public InvalidOperationException(String s){
        super (s);
    }
    
}
