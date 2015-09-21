/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grupp2.calculator.exceptions;


/**
 *
 * @author Darko
 */
/**
 * @param CheckUserInput an exception that gets thrown when the user enters an invalid token into the
 * calculator, for example characters a-z.
 * @author Rasmus
 */
public class CheckUserInput extends Exception{
    
    
    public CheckUserInput(String c){
        super("Invalid Token: " + c);
    }
    
}
