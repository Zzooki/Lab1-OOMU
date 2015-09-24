/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grupp2.calculator.model;

/**
 *
 * @author Tobias
 */

public class Operator extends Token {
    String s;
    
    Operator(){
        this.s = "";
    }
    
    /**
     * Operator constructor creates an operator object
     * @param s is a parameter for the operator wich can be either "+" "*" "/" 
     * "-" or "%".
     */
    Operator(String s){
        this.s = s;
    }

    /**
     * calcExp this function manages the fact that
     * different types of calculations is necessary inorder to calculate 
     * different operators. And depending on the operator the appropriate 
     * calculation functions is called for.
     * @param bucket the datastructure for the tokens is needed to evaluate the
     * expression and therefore a parameter to this function
     * @return returns a double wich is the result of the evaluated expression.
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
