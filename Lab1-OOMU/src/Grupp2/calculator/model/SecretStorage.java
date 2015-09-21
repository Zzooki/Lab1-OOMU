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

    /**
     * @param SecretStorage implementation for the interface called 
     * ISecretInterface. Datastructure chosen for this implementation 
     * is a stack.
     */
public class SecretStorage implements ISecretInterface{
    private Stack stack = new Stack();
    
    /**
     * @param SecretStorage creates an object of the seacret storage wich will 
     * hold the desired datastructure to save the tokens.
     */
    public void SecretStorage(){
    }
    
    /**
     * @param set(Token s) adds a token to the stack when called for.
     */
    public void set(Token s){
        stack.push(s);
    }
    
    /**
     * @param get returns a token and removes it from the stack.
     */
    public Token get(){      
        return (Token)stack.pop();
    }
    
    /**
     * @param isEmpty returns true if the stack is empty
     */
    public boolean isEmpty(){
        return stack.empty();
    }
    
    
    
}
