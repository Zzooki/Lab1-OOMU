package grupp2.calculator.view;

import grupp2.calculator.model.RPNCalculator;
import java.util.Scanner;

/**
 *
 * @author S142015
 */
public class UserInterface implements IProgramInterface{
    private Double d;
    private String line;
    private Scanner input;
    
    /**
     * 
     */
    public UserInterface(){
        this.input = new Scanner(System.in);
    }
    
    @Override
    /**
     * 
     */
    public void runProgram(String args[]){
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
     * 
     */
    public void printMenu(){
        System.out.println("Mata in några tal..");
    }
}

