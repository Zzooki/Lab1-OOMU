/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grupp2.calculator.model;

import java.util.Stack;
import java.util.Scanner;
/**
 *
 * @author Darko
 */
public class Calculate {
    String exp;
    Stack stack;
    
    
    public Calculate(String exp){
        this.exp = exp;
        Stack stack = new Stack();
    }
    
    public void calculateExp(){
        int token;
        Scanner readExp = new Scanner(exp);
        
        System.out.println(exp);
        
        if(readExp.hasNextInt())
            token = readExp.nextInt();
        /*else
          switchbajs  
        */
    }
}
