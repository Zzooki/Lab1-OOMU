package grupp2.calculator;

import grupp2.calculator.controller.Controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 /**
 *
 * @author Tobias
 */


public class Calculator {
    
     /**
     * main function in wich a Controller object is created and the run
     * function is called for.
     * @param args parameter includes the possible addresses for the 
     * in- and output files if the user wishes to run the program with 
     * files as input.
     */
    public static void main(String[] args) {
        Controller cont = new Controller(args.length);
        cont.run(args);
        
    }
    
}
