/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grupp2.calculator.model;

import java.util.Stack;

/**
 *
 * @author Darko
 */
public class ISecretStorage{
    private Stack stack = new Stack();

    public ISecretStorage(){
        
    }
    
    public void set(String s){
        stack.push(s);
    }
    
    public String get(){
        return stack.pop().toString();
    }
    
    public boolean isEmpty(){
        return stack.empty();
    }
    
    //DIZ is My seacret storage pliz
    
}
