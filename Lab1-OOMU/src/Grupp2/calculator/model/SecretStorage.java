/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grupp2.calculator.model;

import java.util.Stack;

/**
 *
 * @author Rasmus
 */

public class SecretStorage implements ISecretInterface{
    private Stack stack = new Stack();
    public void SecretStorage(){
    }
    @Override
    
    public void set(Token s){
        stack.push(s);
    }
    @Override
    
    public Token get(){      
        return (Token)stack.pop();
    }
    @Override
    
    public boolean isEmpty(){
        return stack.empty();
    }
    
    
    
}
