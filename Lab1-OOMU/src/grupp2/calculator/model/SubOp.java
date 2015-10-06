
package grupp2.calculator.model;

/**
 * SubOp Class handles the creation of the subtraction operator which is a 
 * subclass of the operator class. The class contains it's own implementation 
 * to evaluate an expression containing this operator.
 * @author Thires
 */

import grupp2.calculator.exceptions.*;

public class SubOp extends Operator{
    
    /**
     * SubOp constructor creates an object of the subtraction operator.
     */
     public SubOp(){
        
    }
     
     /**
     * calcExp function handles the evaluation of an expression with a 
     * subtraction operator.
     * @param storage in order to calculate the expression the function needs 
     * the data structure in which the tokens are stored which is the parameter 
     * storage.
     * @return the function returns a double, the sum of the evaluated 
     * expression
     */
     @Override
    public Double calcExp(IStorageImplementation storage){
        Double RL = null, LL = null, sum = null;
        try{
            if(storage.isEmpty())
                throw new InvalidOperationException("To few operands..");   
        
            Token tokenRL = storage.get();
            RL = tokenRL.calcExp(storage);
            if(storage.isEmpty())
                throw new InvalidOperationException("To few operands..");   
        
            
            Token tokenLL = storage.get();
            LL = tokenLL.calcExp(storage);

            sum = LL - RL;
        }catch(InvalidOperationException h){
            System.err.println(h);
        }
    
        return(sum);
    }
    
     @Override
     /**
     * toString method for the subtraction operator 
     * @returns the operator as a string
     */
    public String toString(){
        return "-";
    }
}
