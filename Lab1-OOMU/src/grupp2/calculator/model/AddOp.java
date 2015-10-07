package grupp2.calculator.model;

import grupp2.calculator.exceptions.*;

/**
 * AddOp Class handles the creation of the Addition operator which is a 
 * subclass of the operator class. The class contains it's own implementation 
 * to evaluate an expression containing this operator.
 * @author Rasmus
 */

public class AddOp extends Operator{
    
    /**
     * AddOp constructor creates an object of the addition operator.
     */
    public AddOp(){
        
    }
    
     /**
     * calcExp function handles the evaluation of an expression with an addition 
     * operator.
     * @param storage in order to calculate the expression the function needs 
     * the data structure in which the tokens are stored which is the parameter 
     * storage.
     * @return the function returns a double, the sum of the evaluated 
     * expression
     */
    @Override
    public Double calcExp(IStorageImplementation storage){
        Double RL, LL;
        Double sum = null;
        try{
        
        if(storage.isEmpty())
            throw new InvalidOperationException("To few operands..");   
        
        Token tokenRL = storage.get();
        RL = tokenRL.calcExp(storage);
        
        if(storage.isEmpty())
            throw new InvalidOperationException("To few operands..");   
        
        Token tokenLL = storage.get();
        LL = tokenLL.calcExp(storage);
        
        sum = LL + RL;
        }catch(InvalidOperationException h){
            System.err.println(h);
        }
    
        return(sum);
    }
    @Override
    /**
     * toString method for the AddOp class 
     * @returns the addition operator as a string.
     */
    public String toString(){
        return "+";
    }
}
