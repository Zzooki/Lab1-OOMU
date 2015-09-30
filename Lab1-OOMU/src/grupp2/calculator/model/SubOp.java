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

public class SubOp extends Operator{
    
    /**
     * SubOp constructor creats an object of the subtraction operator.
     */
     public SubOp(){
        
    }
     
     /**
     * calcExp function handles the evaluation of an expression with a 
     * subtraction operator.
     * @param bucket in order to calculate the ecpression the function needs 
     * the datastructure in wich the tokens are stored wich is the parameter 
     * bucket.
     * @return the function returns a double, the sum of the evaluated 
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

            sum = LL - RL;
        }catch(CheckUserInput | InvalidOperationException h){
            System.err.println(h);
        }
    
        return(sum);
    }
}
