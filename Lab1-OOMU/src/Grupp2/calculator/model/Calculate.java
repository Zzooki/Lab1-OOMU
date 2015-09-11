/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grupp2.calculator.model;


import java.util.Scanner;
/**
 *
 * @author Darko
 */
public class Calculate {
    String exp;
    
    
    public Calculate(String exp){
        this.exp = exp;
    }
    
    public void calculateExp(){
        String token;
        Scanner readExp = new Scanner(exp);
        ISecretStorage bucket = new ISecretStorage();
        
        System.out.println(exp);
        
        while(readExp.hasNext()){
            bucket.set(readExp.next());
        }
        while(!bucket.isEmpty()){
            switch(token = bucket.get()){
                case "+":
                    
                    break;
                case "-":
                    
                    break;
                case "/":
                    
                    break;
                case "*":
                    
                    break;
                case "%":
                    
                    break;
                default:
                    
                    break;
            }
        }
    }
}
