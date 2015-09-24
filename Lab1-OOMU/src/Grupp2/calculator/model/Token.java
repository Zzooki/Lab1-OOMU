/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grupp2.calculator.model;
import Grupp2.calculator.exceptions.CheckUserInput;

/**
 *
 * @author Rasmus
 */


public class Token {
    String s;
         
    Token(){
        
    }
    
    /**
     * Token constructor creates a token object
     * @param s is the value of the token wich is either an operand or an 
     * operator
     */
    Token(String s){
        this.s = s;
    }
    
    /**
     * calcExp checks if the token is either an operator or an operand.
     * Depending on wich the apptorpriate function is called for to calculate 
     * the expression.
     * @param bucket the datastructure for the tokens are needed to evaluate
     * the expression and therefore a parameter to this function
     * @return returns a double wich is the result of the evaluated expression.
     * @throws CheckUserInput is the user would enter invalid input i.e 
     * characters that is not numeric this error will be thrown so that the
     * user gets another try at valid input.
     */
    public double calcExp(SecretStorage bucket) throws CheckUserInput{
        
    if(checkIfOperator()){
        Operator o = new Operator(this.s);
        return o.calcExp(bucket);
    }
    else if (checkIfOperand()){
        Operand oo = new Operand(this.s);
        return oo.calcExp(bucket);
       }
    else
        throw new CheckUserInput(s);
    }

    /**
     * checkIfOperator function
     * @return returns true if the token is either "+", "-", "/", "*" or "%".
     */
    private boolean checkIfOperator(){
        return "+".equals(s) || "-".equals(s) || "/".equals(s) || "*".equals(s) ||"%".equals(s);
    }
    
    /**
     * checkIfOperand function 
     * @return returns true if the token is a numereic value.
     */
    public boolean checkIfOperand(){
        try{  
          double d = Double.parseDouble(s);  
        }  
        catch(NumberFormatException nfe){  
          return false;  
        }  
        return true;
    }
    
    /**
     * tokenToString function
     * @return returns the token as a string.
     */
    public String tokenToString(){
        return this.s;
    }
    
}
