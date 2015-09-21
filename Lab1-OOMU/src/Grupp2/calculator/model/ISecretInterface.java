/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grupp2.calculator.model;

/**
 *
 * @author Zzooki
 */


    /**
     * @param ISecretInterface interface for the datastructure choosen to store 
     * the tokens.
     */
public interface ISecretInterface {
    
    /**
     * @param SecretStorage creates an object of the choosen datastructure to 
     * store the tokens
     */
    public void SecretStorage();
    /**
     * @param set(Token s) accessor function that takes a token in order to add 
     * it to the datastructure.
     */
    public void set(Token s);
    /**
     * @param get accessor function that returns a token in order to remove it 
     * from the datastructure.
     */
    public Token get();
    /**
     * @param isEmpty accessor function that enables the user to check if the 
     * datastructure is empty (currently not holding any tokens)
     */
    public boolean isEmpty();
}
