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
public class ModOp extends Operator{
    public ModOp(){
        
    }
     
    public double calcExp(ISecretStorage bucket){
        double RL, LL, sum = 0;
        try{
            Token TokenRL = bucket.get();
            RL = TokenRL.calcExp(bucket);
            Token TokenLL = bucket.get();
            LL = TokenLL.calcExp(bucket);

            sum = LL % RL;
        }catch(CheckUserInput h){
            System.err.println(h);
        }
        return(sum);
    }
}
