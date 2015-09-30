/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupp2.calculator.view;

import grupp2.calculator.model.RPNCalculator;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author S142015
 */
public class FileInterface implements IProgramInterface {
    Double d;
            
    public FileInterface(){
        
    }
    
    @Override
    public void runProgram(String args[]){
        RPNCalculator calc = new RPNCalculator();
        
        try{
            File inFile = new File(args[0]);
            File outFile = new File(args[1]);
            FileWriter out = new FileWriter(outFile);
            

            Scanner in = new Scanner(inFile);
            while(in.hasNextLine()){
                
                d = calc.CalculateResult(in.nextLine());
                if(d != null)
                    out.write(d + "\n");
                else
                    out.write("Error\n");
            }

            out.flush();
            out.close();
        }
        catch(FileNotFoundException e){
            System.err.println(e);
        }
        catch(IOException q){
            System.err.println(q);
        }
    }
}
