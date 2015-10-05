/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupp2.calculator.exceptions;

/**
 * DivideByZeroException Class handles the error occurring when the user or the
 * file contains an expression where the denominator is zero.
 * @author S142015
 */
public class DivideByZeroException extends Exception{
     /**
      * DivideByZeroException method prints an appropriate error message for the
      * error occurring when an expression contains a denominator which is zero.
      * @param s the parameter is the error occurred. 
      */
     public DivideByZeroException(String s){
        super ("Can't divide by zero: " + s);
    }
}
