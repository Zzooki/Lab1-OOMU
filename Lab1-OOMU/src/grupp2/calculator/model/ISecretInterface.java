/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupp2.calculator.model;

/**
 *
 * @author Tobias
 */


public interface ISecretInterface {
    
    /**
     * SecretStorage creates an object of the choosen datastructure to 
     * store the tokens
     */
    public void SecretStorage();
    /**
     * set accessor function
     * @param s s is the token that needs to be added to the datastructure
     */
    public void set(Token s);
    /**
     *  that 
     */
    /**
     * get accessor function
     * @return returns a token in order to remove it from the datastructure.
     */
    public Token get();
    /**
     * isEmpty accessor function
     * @return returns true if the datastructure is not holding any
     * tokens
     */
    public boolean isEmpty();
}
