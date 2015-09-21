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
     * @param Operand class is a subclass of the class Token. This object is 
     * created when the token is evaluated as a numeric type.
     */
public class Operand extends Token{
    String s;
    
    Operand(){
        this.s = "";
    }
    /**
     * @param Operand cunstructor creates an object which consists of the 
     * operands value.
     */
    Operand(String s){
        this.s = s;
    }

   /**
     * @param calcExp(SecretStorage bucket) this function returns the value of 
     * the object when called for as a double.
     */
    public double calcExp(SecretStorage bucket){
        return Double.parseDouble(s);
    }
}
