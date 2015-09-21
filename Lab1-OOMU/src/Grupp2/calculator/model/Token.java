/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grupp2.calculator.model;
import Grupp2.calculator.exceptions.CheckUserInput;

/**
 *
 * @author Darko
 */


    /**
     * Token class handles the tokens depending on if the token is an 
     * operator or an operand the different calculation functions is called for.
     */
public class Token {
    String s;
         
    Token(){
        
    }
    
    /**
     * Token constructor creates a token object in wich either an
     * operator or an operand is stored.
     */
    Token(String s){
        this.s = s;
    }
    
    /**
     * calcExp(SecretStorage bucket) this function checks if the token 
     * is either an operator or an operand. Depending on wich the appropriate 
     * function is called for to calculate the expression.
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
     * checkIfOperator function that returns true if the token is either
     * "+", "-", "/", "*" or "%".
     */
    private boolean checkIfOperator(){
        return "+".equals(s) || "-".equals(s) || "/".equals(s) || "*".equals(s) ||"%".equals(s);
    }
    
    /**
     * checkIfOperand function that returns true if the token is a 
     * numereic value.
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
     * tokenToString function that returns the token as a string.
     */
    public String tokenToString(){
        return this.s;
    }
    
}
