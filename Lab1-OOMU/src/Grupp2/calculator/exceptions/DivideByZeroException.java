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

public class DivideByZeroException extends Exception {
    

    public DivideByZeroException(String s){
        super ("DivideByZeroException: " + s);
    }
    
}
