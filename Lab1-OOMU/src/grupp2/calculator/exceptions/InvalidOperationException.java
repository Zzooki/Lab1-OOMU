/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupp2.calculator.exceptions;

/**
 * InvalidOperationException Class handles the error which gets thrown when the 
 * expression contains either to few operators or to few or to many operands.
 * @author Thires
 */

public class InvalidOperationException extends Exception{
    
    /**
     * InvalidOperationException, exception that gets thrown whenever the user 
     * tries to evaluate an expression that has too few or to many 
     * operators/operands.
     * @param s the parameter is for the error occurred.
     */
    public InvalidOperationException(String s){
        super (s);
    }
    
}
