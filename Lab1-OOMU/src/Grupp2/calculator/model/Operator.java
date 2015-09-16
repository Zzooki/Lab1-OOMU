/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grupp2.calculator.model;

/**
 *
 * @author Darko
 */


public class Operator extends Token {
    String s;
    
    Operator(){
        this.s = "";
    }
    
    Operator(String s){
        this.s = s;
    }

   
            
    public double calcExp(ISecretStorage bucket){

        if(null != s)switch (s) {
            case "+":
                AddOp aOp = new AddOp();
                return aOp.calcExp(bucket);
            case "-":
                SubOp sOp = new SubOp();
                return sOp.calcExp(bucket);
            case "*":
                MultiplicationOp mOp = new MultiplicationOp();
                return mOp.calcExp(bucket);
            case "/":
                DivisionOp dOp = new DivisionOp();
                return dOp.calcExp(bucket);
            case "%":
                ModOp ModulusOp = new ModOp();
                return ModulusOp.calcExp(bucket);
        }
        return 0.0;
    }
}
