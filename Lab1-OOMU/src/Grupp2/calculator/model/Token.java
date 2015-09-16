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


public class Token {
    char c;
            
    Token(String s){
        c = s.charAt(0);

    }
    public double calcExp(ISecretStorage bucket){
        
    }
    
    private boolean checkIfOperator(){
        return c == '+' || c == '-' || c == '/' || c == '*' ||c == '%';
    }
    
    private boolean checkIfOperand(){
        try{  
          double d = Double.parseDouble(Character.toString(c));  
        }  
        catch(NumberFormatException nfe){  
          return false;  
        }  
        return true;
    }
    
}
