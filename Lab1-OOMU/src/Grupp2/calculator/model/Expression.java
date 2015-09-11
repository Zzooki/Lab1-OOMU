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
public class Expression {
    private Double left, right;
    private char operator;
    
    Expression(){
        left = null;
        right = null;
    }
    
    public void setOperator(String token){
        operator = token.charAt(0);
    }
    
    public void setLeft(Double value){
        left = value;
    }
    
    public void setRight(Double value){
        right = value;
    }
    
    public boolean isRightFree(){
        return(right == null);
    }
    
    
}
