/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupp2.calculator.model;

/**
 * IStorageImplementation class is the interface containing the methods available
 * in order to manage the tokens stored within the chosen data structure.
 * @author Tobias
 */


public interface IStorageImplementation {
    
    /**
     * SecretStorage creates an object of the chosen data structure to 
     * store the tokens
     */
    public void SecretStorage();
    
    /**
     * set accessor function
     * @param s s is the token that needs to be added to the data structure
     */
    public void set(Token s);
    
    /**
     * get accessor function
     * @return returns a token in order to remove it from the data structure.
     */
    public Token get();
    
    /**
     * isEmpty accessor function
     * @return returns true if the data structure is not holding any
     * tokens
     */
    public boolean isEmpty();
}
