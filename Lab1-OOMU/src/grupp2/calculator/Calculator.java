package grupp2.calculator;

import grupp2.calculator.controller.Controller;

 /**
 * Calculator class handles the main function as well as creating a Controller
 * object to continue the execution by calling for the run function.
 * @author Tobias
 */


public class Calculator {
    
     /**
     * main function in which a Controller object is created and the run
     * function is called for.
     * @param args parameter includes the possible addresses for the 
     * in- and output files if the user wishes to run the program with 
     * files as input.
     */
    public static void main(String[] args) {
        Controller cont = new Controller(args.length, args);
        cont.run();
        
    }
    
}
