package grupp2.calculator.view;

import grupp2.calculator.model.RPNCalculator;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

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
            /*File outFile = new File(args[1]);
            FileWriter out = new FileWriter(outFile);*/
            
            File outFile = new File(args[1]);
            FileOutputStream fos = new FileOutputStream(outFile);
            PrintStream ps = new PrintStream(fos);
            System.setOut(ps);
            System.setErr(ps);

            Scanner in = new Scanner(inFile);
            while(in.hasNextLine()){
                
                d = calc.CalculateResult(in.nextLine());
                
                if(d != null)
                    System.out.println(d);
                //else
                    //System.out.println("Error:");
            }

            //out.flush();
            //out.close();
        }
        catch(FileNotFoundException e){
            System.err.println(e);
        }
    }
}
