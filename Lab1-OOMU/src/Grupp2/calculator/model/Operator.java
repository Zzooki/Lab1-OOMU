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
        s = "";
    }
    
    Operator(String s){
        this.s = s;
    }

   
            
    public double calcExp(ISecretStorage bucket){
        if(s == "+"){
            AddOp aOp = new AddOp();
            return aOp.calcExp(bucket);
        }
        else if(s == "-"){
            SubOp sOp = new SubOp();
            return sOp.calcExp(bucket);
        }
        else if (s == "*"){
            MultiplicationOp mOp = new MultiplicationOp();
           return mOp.calcExp(bucket);
        }
        else if (s == "/"){
            DivisionOp dOp = new DivisionOp();
            return dOp.calcExp(bucket);
        }
        else{
            ModOp ModulusOp = new ModOp();
            return ModulusOp.calcExp(bucket);
        }
    }
}
