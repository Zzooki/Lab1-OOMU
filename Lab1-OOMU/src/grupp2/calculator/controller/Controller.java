package grupp2.calculator.controller;

import grupp2.calculator.view.FileInterface;
import grupp2.calculator.view.IProgramInterface;
import grupp2.calculator.view.UserInterface;

/**
 * The Controller class handles views so that different views are created if 
 * the user wishes to run the program with their own input or with input
 * stored in a file. 
 * @author Tobias
 */

public class Controller {
    private int commandLineParameterCount;
    private String arguments[];
    
    
    public Controller(){
        this.commandLineParameterCount = 0;
    }
    /**
     * Controller the constructor for the Controller class
     * @param gear depending on this value the program will either read a file
     * or reds input from the user
     * @param args contains the search paths for in and output files required if the
     * user wishes to run the program with an in- and output file.
     */
    public Controller(int gear, String args[]){
        this.commandLineParameterCount = gear;
        arguments = args;
    }
    
    public Controller(int gear){
        commandLineParameterCount = gear;
    }
  
    /**
     * run function handles the two types of running-styles of the program
     * by creating a view either for the "user-input mode" or the "file input mode"
     */
    public void run(){
        IProgramInterface view;
        if(commandLineParameterCount != 0 && commandLineParameterCount != 2) 
        {
            System.out.println("Syntax: java Calculator " + arguments[0]);
            System.exit(1);
        }
        if(commandLineParameterCount == 0){
            view = new UserInterface();
            view.runProgram(arguments);
        }else{
            view = new FileInterface();
            view.runProgram(arguments);
        }
    
    }
    
}
