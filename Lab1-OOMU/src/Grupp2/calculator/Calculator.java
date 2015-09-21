package Grupp2.calculator;

import Grupp2.calculator.controller.Controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 /**
 *
 * @author Darko
 */

    /**
     * @param Calculator the class in wich the main function is called.
     */

public class Calculator {
    
    /**
     * @param main function in wich a Controller object is created and the run
     * function is called for.
     */
    public static void main(String[] args) {
        Controller cont = new Controller(args.length);
        cont.run(args);
        
    }
    
}
