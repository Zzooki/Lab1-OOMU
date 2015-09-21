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
public interface ISecretInterface {
    
    public void SecretStorage();
    public void set(Token s);
    public Token get();
    public boolean isEmpty();
}
