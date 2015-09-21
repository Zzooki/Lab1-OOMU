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
     * AddOp class is a subclass of the Operator class. This handles the
     * addition operator objects.
     */
public class AddOp extends Operator{
    
    /**
     * AddOp constructor creats an object of the addition operator.
     */
    public AddOp(){
        
    }
    
    /**
     * calcExp(seacretStorage bucket) this function handles the
     * evaluation of an expression with the addition operator. To be able to 
     * calculate the expression the function needs the datastructure in wich 
     * the operands is stored called the bucket. After the evaluation the
     * result is returned as a double.
     */
    public double calcExp(SecretStorage bucket){
        double RL, LL, sum = 0.0;
        try{
        Token TokenRL = bucket.get();
        RL = TokenRL.calcExp(bucket);
        Token TokenLL = bucket.get();
        LL = TokenLL.calcExp(bucket);
        
        sum = LL + RL;
        }catch(CheckUserInput h){
            System.err.println(h);
        }
        return(sum);
    }

}
