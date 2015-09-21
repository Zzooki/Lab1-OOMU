/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grupp2.calculator.model;

import Grupp2.calculator.view.*;
import Grupp2.calculator.exceptions.*;

import java.util.Scanner;
import java.util.Set;
/**
 *
 * @author Darko
 */

    /**
     * @param Calculate class is a class handles the user input by changing the
     * operators and operands into tokens and storing them in the choosen 
     * datastructure "bucket".
     */
public class Calculate {
    String exp;
    
    /**
     * @param Calculate(String exp) constructor creats a Calculate object and stores the
     * expression as a string.
     */
    public Calculate(String exp){
        this.exp = exp;
    }
    
    /**
     * @param CalculationMagic function that creates a new bucket and a scanner
     * to handle the input and seperate it into tokens. Also the first token is
     * withdrawn from the bucket to start the recursive call and the evaluation
     * process.
     */
    public double CalculationMagic(){
        SecretStorage bucket = new SecretStorage();        
        Scanner readExp = new Scanner(exp);
        double d;
        
        
        while(readExp.hasNext()){
            bucket.set(new Token(readExp.next()));
        }
        Token t; //= new Token();
        t = (bucket.get());

        try{
            d = t.calcExp(bucket);
            if(!bucket.isEmpty())
                throw new NumberFormatException("InvalidOperationException");
            return(d);

        }catch(NumberFormatException wrong){
            System.err.println(wrong);
        }catch(CheckUserInput h){
            System.err.println(h);
        }
        return 0;
    }
    
    
}
    

