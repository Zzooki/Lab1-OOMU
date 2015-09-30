/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupp2.calculator.model;


import grupp2.calculator.exceptions.*;
import java.util.Scanner;
import java.util.Set;
/**
 *
 * @author Thires
 */

public class RPNCalculator {
    //String exp;
    SecretStorage storage;
    
    /**
     * Calculate constructor creats a Calculate object
     * @param exp is a string(expression) that needs to be converted into 
     * tokens in order to be evaluated.
     */
    public RPNCalculator(){
        this.storage = new SecretStorage(); 
    }
    
    /**
     * CalculatoinMagic function divides the expressions into tokens and starts 
     * the recursive call for the eveluations process.
     * @return is a double that's the sum of the evaluated expression.
     */
    public Double CalculateResult(String exp) throws CheckUserInput{
               
        Scanner readExp = new Scanner(exp);
        Double d = null;
        Token o;
        
        

        try{
            while(readExp.hasNext()){   
                String s = readExp.next();


                if(checkIfOperator(s))
                    o = new Operator(s);
                else if (checkIfOperand(s))
                    o = new Operand(s);
                else
                    throw new CheckUserInput(s);

                storage.set(o);
            }
            Token t; //= new Token
            t = (storage.get());
            d = t.calcExp(storage);
            if(!storage.isEmpty())
                throw new InvalidOperationException(t.tokenToString());
            else
                return(d);

        }catch(NumberFormatException wrong){
            System.err.println(wrong);
        }catch(CheckUserInput h){
            System.err.println(h);
        }catch(InvalidOperationException h){
            System.err.println(h);
        }
        
        return null;
        
    }
        /**
     * checkIfOperator function
     * @return returns true if the token is either "+", "-", "/", "*" or "%".
     */
    private boolean checkIfOperator(String s){
        return "+".equals(s) || "-".equals(s) || "/".equals(s) || "*".equals(s) ||"%".equals(s);
    }
    
    
    
    /**
     * checkIfOperand function 
     * @return returns true if the token is a numereic value.
     */
    public boolean checkIfOperand(String s){
        try{  
          Double d = Double.parseDouble(s);  
        }  
        catch(NumberFormatException nfe){  
          return false;  
        }  
        return true;
    }
}
    

    
    



