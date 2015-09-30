/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupp2.calculator.model;

/**
 *
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
     * @param bucket in order to calculate the ecpression the function needs 
     * the datastructure in wich the tokens are stored wich is the parameter 
     * bucket.
     * @return the function returns a double, the result of the evaluated 
     * expression
     */
    @Override
    public Double calcExp(SecretStorage bucket){
        Double RL = null, LL = null, sum = null;
        try{
            if(bucket.isEmpty())
                throw new InvalidOperationException("To few operands..");   
        
            Token tokenRL = bucket.get();
            RL = tokenRL.calcExp(bucket);
            
            if(bucket.isEmpty())
                throw new InvalidOperationException("To few operands..");   
        
            Token tokenLL = bucket.get();
            LL = tokenLL.calcExp(bucket);
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

}
