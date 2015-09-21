/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grupp2.calculator.model;
import Grupp2.calculator.exceptions.*;

/**
 *
 * @author Zzooki
 */

    /**
     * @param SubOp class is a subclass of the Operator class. This handles the
     * subtraction operator objects.
     */
public class SubOp extends Operator{
    
    /**
     * @param SubOp constructor creats an object of the subtraction operator.
     */
     public SubOp(){
        
    }
     
     /**
     * @param calcExp(seacretStorage bucket) this function handles the
     * evaluation of an expression with the subtraction operator. To be able to 
     * calculate the expression the function needs the datastructure in wich 
     * the operands is stored called the bucket. After the evaluation the
     * result is returned as a double.
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
