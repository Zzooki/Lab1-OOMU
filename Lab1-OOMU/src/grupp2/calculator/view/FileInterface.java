package grupp2.calculator.view;

import grupp2.calculator.model.RPNCalculator;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author S142015
 */
public class FileInterface implements IProgramInterface {
    Double d;
    
    /**
     * 
     */
    public FileInterface(){
        
    }
    
    @Override
    public void runProgram(String args[]){
        RPNCalculator calc = new RPNCalculator();
        
        try{
            
            File inFile = new File(args[0]);
           
            
            File outFile = new File(args[1]);
            FileOutputStream fileOutputStream = new FileOutputStream(outFile);
            PrintStream printStream = new PrintStream(fileOutputStream);
            System.setOut(printStream);
            System.setErr(printStream);

            Scanner in = new Scanner(inFile);
            while(in.hasNextLine()){
                
                d = calc.CalculateResult(in.nextLine());
                
                if(d != null)
                    System.out.println(d);
            }

            fileOutputStream.flush();
            fileOutputStream.close();
        }
        catch(FileNotFoundException e){
            System.err.println(e);
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
