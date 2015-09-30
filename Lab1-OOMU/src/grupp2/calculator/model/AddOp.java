/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupp2.calculator.model;

import grupp2.calculator.exceptions.*;

/**
 *
 * @author Rasmus
 */


public class AddOp extends Operator{
    
    /**
     * AddOp constructor creats an object of the addition operator.
     */
    public AddOp(){
        
    }
    
     /**
     * calcExp function handles the evaluation of an expression with an addition 
     * operator.
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
        
        sum = LL + RL;
        }catch(InvalidOperationException h){
            System.err.println(h);
        }
    
        return(sum);
    }

}
