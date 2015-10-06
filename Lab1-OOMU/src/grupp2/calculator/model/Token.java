package grupp2.calculator.model;

/**
 * Token Class is a abstract class which the operator and the operand class
 * inherits from. The methods in the token class is required to be implemented
 * by the operator class and the operand class in order to evaluate an expression.
 * @author Rasmus
 */


public abstract class Token {

    
    
    /**
     * calcExp is required to be implemented by the operator class and the 
     * operand class which makes this an abstract method.
     * @param bucket the data structure for the tokens are needed to evaluate
     * the expression and therefore a parameter to this function
     * @return returns a double which is the result of the evaluated expression.
     */
    public abstract Double calcExp(IStorageImplementation bucket);
    
    /**
     * toString method for the tokens is appriciated to be abled to be described
     * as a string and therefore implemented in the operator class aswell as the 
     * operand class.
     * @return the operator or the operand as a string.
     */
    public abstract String toString();
}
