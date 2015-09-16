/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grupp2.calculator.model;

/**
 *
 * @author Zzooki
 */
public class MultiplicationOp extends Operator{
    public MultiplicationOp(){
        
    }
     
    public double calcExp(ISecretStorage bucket){
        Double RL, LL, sum;
        Token TokenRL = bucket.get();
        RL = TokenRL.calcExp(bucket);
        Token TokenLL = bucket.get();
        LL = TokenLL.calcExp(bucket);
        
        sum = LL * RL;
        
        return(sum);
    }
}
