package grupp2.calculator.view;

import grupp2.calculator.model.RPNCalculator;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * FileInterface Class implements the IProgramInterface and handles the run 
 * function in case the user wishes to run the program with an in/output file.
 * @author Tobias
 */
public class FileInterface implements IProgramInterface {
    private Double d;
    private File inFile;
    private File outFile;
    
    /**
     * Constructor for the FileInterface class.
     * @param args is the parameter for constructor method wich contains the 
     * search paths for the in/output files. And is required to be able to run
     * the program in "in/output-mode".
     */
    public FileInterface(String args[]){
        this.inFile = new File(args[0]);
        this.outFile = new File(args[1]);
    }
    
    @Override
    /**
     * runProgram handles the reading from an printing to the files provided
     * by the user. This function also calls for the evaluation method so that
     * the expressions in the files can be evaluated. When the evaluation is finnished
     * the function will print the results to the output file. Also contains error
     * checking if the files does not exists.
     */
    public void runProgram(){
        RPNCalculator calc = new RPNCalculator();
        
        try(FileOutputStream fileOutputStream = new FileOutputStream(outFile)){

            PrintStream printStream = new PrintStream(fileOutputStream);
            System.setOut(printStream);
            System.setErr(printStream);

            Scanner in = new Scanner(inFile);
            while(in.hasNextLine()){
                
                d = calc.CalculateResult(in.nextLine());
                
                if(d != null)
                    System.out.println(d);
            }
        }
        catch(FileNotFoundException e){
            System.err.println(e);
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
