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
    public Double CalculateResult(String exp){
               
        Scanner readExp = new Scanner(exp);
        Double d = null;
        
        
        
        while(readExp.hasNext()){
            storage.set(new Token(readExp.next()));
        }
        Token t; //= new Token
        t = (storage.get());

        try{
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
    
    
}


