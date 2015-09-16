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
public class DivisionOp extends Operator{
    public DivisionOp(){
        
    }
     
    public double calcExp(ISecretStorage bucket){
        Double RL, LL, sum;
        Token TokenRL = new Token(bucket.get());
        RL = TokenRL.calcExp(bucket);
        Token TokenLL = new Token(bucket.get());
        LL = TokenLL.calcExp(bucket);
        
        sum = LL / RL;
        
        return(sum);
    }
}
