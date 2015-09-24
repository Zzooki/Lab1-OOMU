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

public class CheckUserInput extends Exception{
    
    /**
     * CheckUserInput an exception that gets thrown when the user enters an 
     * invalid token into the calculator, for example characters a-z.
     * @param c is the parameter for the error occured.
     */
    public CheckUserInput(String c){
        super("Invalid Token: " + c);
    }
    
}
