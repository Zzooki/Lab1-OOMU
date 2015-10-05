/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupp2.calculator.model;

/**
 *
 * @author Tobias
 */


import grupp2.calculator.exceptions.*;

public class ModOp extends Operator{
    /**
     * DivisionOp constructor creates an object of the modulo operator.
     */
    public ModOp(){
        
    }
     
     /**
     * calcExp function handles the evaluation of an expression with a modulo 
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
                throw new DivideByZeroException(LL + "%" + RL);
            sum = LL % RL;
        }catch(InvalidOperationException h){
            System.err.println(h);
        }catch(DivideByZeroException h){
            System.err.println(h);
        }
    
        return(sum);
    }
    
         @Override
    public String toString(){
        return "%";
    }
}
