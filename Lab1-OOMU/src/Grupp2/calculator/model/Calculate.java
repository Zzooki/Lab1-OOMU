/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grupp2.calculator.model;

import Grupp2.calculator.view.*;

import java.util.Scanner;
import java.util.Set;
/**
 *
 * @author Darko
 */
public class Calculate {
    String exp;
    
    public Calculate(String exp){
        this.exp = exp;
    }
    
    public double CalculationMagic(){
        ISecretStorage bucket = new ISecretStorage();        
        Scanner readExp = new Scanner(exp);
        double d;
        
        
        while(readExp.hasNext()){
            bucket.set(new Token(readExp.next()));
        }
        Token t; //= new Token();
        t = (bucket.get());

        try{
            d = t.calcExp(bucket);
            return(d);

        }catch(NumberFormatException wrong){
            /// felhantering
            return(0);
        }
    }
    
    
}
    

