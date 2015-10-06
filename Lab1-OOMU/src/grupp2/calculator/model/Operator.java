package grupp2.calculator.model;

/**
 * Operator class is a abstract subclass of the token class. The operators 
 * inherits from the operator class and therefore the implementation for the 
 * different operators are handled seperatly and overriden from this class.
 * @author Tobias
 */

public abstract class Operator extends Token {

    /**
     * calcExp this function manages the fact that different types of 
     * calculations is necessary in order to calculate different operators. 
     * Depending the underlying representation for the operator the right kind 
     * of calculation will be handled when this method is called for. Given that the
     * right operator object is created before storing it in the data structure.
     * @param bucket the data structure for the tokens is needed to evaluate the
     * expression and therefore a parameter to this method
     * @return returns a double which is the result of the evaluated expression.
     */
    @Override
    abstract public Double calcExp(IStorageImplementation bucket);
    
    @Override
    abstract public String toString();
}
