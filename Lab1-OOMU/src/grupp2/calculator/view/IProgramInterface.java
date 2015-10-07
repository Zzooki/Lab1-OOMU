/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupp2.calculator.view;

/**
 * IProgramInterface is the interface which is used to enable the user to run
 * the program in two different modes. The classes implementing this function
 * will either run the program in consoll mode so that the user can provide his/her
 * own input directly into the console. Alternately the user can provide search
 * paths so that it can be runned with files as in/output.
 * @author Thires
 */
public interface IProgramInterface {
    
     /**
     * runProgram the method handling the two different run-styles for this program.
     * Depending on if the user wishes to run the program in "user-input mode"
     * or with a file as input.
     */
   public void runProgram();
}
