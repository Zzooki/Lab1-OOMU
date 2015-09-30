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
     * @param storage in order to calculate the ecpression the function needs 
 the datastructure in wich the tokens are stored wich is the parameter 
 storage.
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
        
        sum = LL + RL;
        }catch(InvalidOperationException h){
            System.err.println(h);
        }
    
        return(sum);
    }
    @Override
    public String toString(){
        return "+";
    }
}
