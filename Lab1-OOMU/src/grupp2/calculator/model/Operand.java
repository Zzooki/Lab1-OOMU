/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupp2.calculator.model;

/**
 *
 * @author Thires
 */

public class Operand extends Token{
    private Double d;
    
    Operand(){
        this.d = null;
    }
    
    /**
     * Operand constructor creates an operand object
     * @param s is parameter for the value of the operand
     */
    Operand(String s){
        this.d = Double.parseDouble(s);
    }

   /**
     * calcExp(SecretStorage bucket) this function returns the value of 
     * the object when called for as a double.
     */
    /**
     * calcExp 
     * @param bucket parameter bucket in which tokens are stored
     * @return returns the value of the operand object when called for.
     */
    public Double calcExp(IStorageImplementation bucket){
        return d;
    }
    public String toString(){
        return Double.toString(d);
    }
}
