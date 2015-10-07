package grupp2.calculator.model;

/**
 * Operand Class is a subclass of the token class these objects are
 * created whenever the token is numeric and not an operator.
 * @author Thires
 */

public class Operand extends Token{
    private Double d;
    
    Operand(){
        this.d = null;
    }
    
    /**
     * Operand constructor creates an operand object
     * @param s is parameter containing the value of the operand
     */
    Operand(String s){
        this.d = Double.parseDouble(s);
    }

    /**
     * calcExp(SecretStorage bucket) 
     * @param bucket parameter is the data structure in which the tokens are stored
     * @return returns the value of the operand object when called for.
     */
    @Override
    public Double calcExp(IStorageImplementation bucket){
        return d;
    }
    
    /**
     * toString method for the Operand objects
     * @return returns the value of the operand as a string.
     */
    @Override
    public String toString(){
        return Double.toString(d);
    }
}
