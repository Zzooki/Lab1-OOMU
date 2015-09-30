/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupp2.calculator.model;

/**
 *
 * @author Tobias
 */

public abstract class Operator extends Token {

    /**
     * calcExp this function manages the fact that
     * different types of calculations is necessary inorder to calculate 
     * different operators. And depending on the operator the appropriate 
     * calculation functions is called for.
     * @param bucket the datastructure for the tokens is needed to evaluate the
     * expression and therefore a parameter to this function
     * @return returns a double wich is the result of the evaluated expression.
     */
    @Override
    abstract public Double calcExp(IStorageImplementation bucket);
    
    @Override
    abstract public String toString();
}
