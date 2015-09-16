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
public class Operand extends Token{
    String s;
    
    Operand(){
        
    }
    Operand(String s){
        this.s = s;
        
    }

   
    public double calcExp(ISecretStorage bucket){
        
        return 0.0;
    }
}
