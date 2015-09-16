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
    
    
    public Calculate(String exp){
        ISecretStorage bucket = new ISecretStorage();        
        Scanner readExp = new Scanner(exp);
        Token t = new Token();
        System.out.println(exp);
        
        while(readExp.hasNext()){
            bucket.set(readExp.next());
        }
        t.calcExp(bucket);
    }
    
    
}
    

