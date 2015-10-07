package grupp2.calculator.view;

import grupp2.calculator.model.RPNCalculator;
import java.util.Scanner;

/**
 * UserInterface Class implements the IProgramInterface and handles the run 
 * function in case the user wishes to run the program in "user input mode".
 * @author Rasmus
 */
public class UserInterface implements IProgramInterface{
    private Double d;
    private String line;
    private Scanner input;
    
    /**
     * UserInterface constructor for the class creates a scanner inorder to 
     * read the input provided by the user.
     */
    public UserInterface(){
        this.input = new Scanner(System.in);
    }
    
    @Override
    /**
     * runProgram handles the reading the expressions given by the user. This 
     * method also calls for the evaluation function so tha the expressions can 
     * be evaluated. When the evaluation is finnished the result will be printed 
     * in the console.
     */
    public void runProgram(){
        RPNCalculator calc = new RPNCalculator();

        while(true){
        printMenu();
        line = input.nextLine();
        if ("".equals(line)) System.exit(1);
        d = calc.CalculateResult(line);
        if(d != null)
            System.out.println("Resultat: " + d);
        }
        
    }
    /**
     * printMenu prints a welcoming message with instructions for the user.
     */
    public void printMenu(){
        System.out.println("Mata in några tal..");
    }
}

