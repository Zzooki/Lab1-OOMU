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
    String s;
            
    Token(){
        
    }
    
    Token(String s){
        this.s = s;
    }
    public double calcExp(ISecretStorage bucket){
        
        //try{
        if(checkIfOperator()){
            Operator o = new Operator(this.s);
            return o.calcExp(bucket);
        }
        else if (checkIfOperand()){
            Operand oo = new Operand(this.s);
            return oo.calcExp(bucket);
        }
        /*}catch{
        }catch(NumberFormatException wrong){
        
        }*/
        return 0.0;
    }
    
    private boolean checkIfOperator(){
        return "+".equals(s) || "-".equals(s) || "/".equals(s) || "*".equals(s) ||"%".equals(s);
    }
    
    private boolean checkIfOperand(){
        try{  
          double d = Double.parseDouble(s);  
        }  
        catch(NumberFormatException nfe){  
          return false;  
        }  
        return true;
    }
    
}
