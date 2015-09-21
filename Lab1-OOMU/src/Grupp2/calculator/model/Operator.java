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

    /**
     * @param Operator class is a subclass of the class Token. This object is 
     * created when the token is evaluated as a operator type i.e "+" "*" "/" 
     * "-" or "%".
     */
public class Operator extends Token {
    String s;
    
    Operator(){
        this.s = "";
    }
    
    /**
     * @param Operator constructor creates an object holding the value of the 
     * operator. Wich can be either "+" "*" "/" "-" or "%".
     */
    Operator(String s){
        this.s = s;
    }

   
     /**
     * @param calcExp(SecretStorage bucket) this function manages the fact that
     * different types of calculations is necessary inorder to calculate 
     * different operators. So depending on wich kind of operator the 
     * appropriate function for that operator is called for. 
     */       
    public double calcExp(SecretStorage bucket){

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
