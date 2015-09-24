/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grupp2.calculator.model;
import Grupp2.calculator.exceptions.*;

/**
 *
 * @author Thires
 */

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
    public double calcExp(SecretStorage bucket){
        double RL, LL, sum = 0;
        try{
        Token TokenRL = bucket.get();
        RL = TokenRL.calcExp(bucket);
        Token TokenLL = bucket.get();
        LL = TokenLL.calcExp(bucket);
        
        sum = LL - RL;
        }catch(CheckUserInput h){
            System.err.println(h);
        }
        return(sum);
    }
}
