package grupp2.calculator.view;

import grupp2.calculator.model.RPNCalculator;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * FileInterface Class 
 * @author S142015
 */
public class FileInterface implements IProgramInterface {
    private Double d;
    
    /**
     * 
     */
    public FileInterface(){
        
    }
    
    @Override
    /**
     * 
     */
    public void runProgram(String args[]){
        RPNCalculator calc = new RPNCalculator();
        File inFile = new File(args[0]);
        File outFile = new File(args[1]);
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
