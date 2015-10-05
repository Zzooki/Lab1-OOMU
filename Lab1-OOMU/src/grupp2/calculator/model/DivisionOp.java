package grupp2.calculator.model;

/**
 * DivisionOp Class handles the creation of the division operator which is a 
 * subclass of the operator class. The class contains it's own implementation 
 * to evaluate an expression containing this operator.
 * @author Thires
 */

import grupp2.calculator.exceptions.*;

public class DivisionOp extends Operator{
    /**
     * DivisionOp constructor creats an object of the division operator.
     */
    public DivisionOp(){
        
    }
     
     /**
     * calcExp function handles the evaluation of an expression with an division 
     * operator.
     * @param storage in order to calculate the expression the function needs 
     * the data structure in which the tokens are stored which is the parameter 
     * storage.
     * @return the function returns a double, the result of the evaluated 
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
            if(RL == 0)
                throw new DivideByZeroException(LL + "/" + RL);
            sum = LL / RL;
            
        }catch(InvalidOperationException h){
            System.err.println(h);
        }catch(DivideByZeroException h){
            System.err.println(h);
        }
    
        return(sum);
    }

         @Override
    public String toString(){
        return "/";
    }
}
