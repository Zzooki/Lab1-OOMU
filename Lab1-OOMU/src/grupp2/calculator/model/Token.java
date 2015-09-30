/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupp2.calculator.model;
import grupp2.calculator.exceptions.CheckUserInput;

/**
 *
 * @author Rasmus
 */


public abstract class Token {

    
    /**
     * Token constructor creates a token object
     * @param s is the value of the token wich is either an operand or an 
     * operator
     */

    
    /**
     * calcExp checks if the token is either an operator or an operand.
     * Depending on wich the apptorpriate function is called for to calculate 
     * the expression.
     * @param bucket the datastructure for the tokens are needed to evaluate
     * the expression and therefore a parameter to this function
     * @return returns a double wich is the result of the evaluated expression.
     * @throws CheckUserInput is the user would enter invalid input i.e 
     * characters that is not numeric this error will be thrown so that the
     * user gets another try at valid input.
     */
    public abstract Double calcExp(SecretStorage bucket);
}
