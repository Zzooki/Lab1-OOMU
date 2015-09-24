/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grupp2.calculator.controller;

import Grupp2.calculator.model.*;
import Grupp2.calculator.view.*;
import Grupp2.calculator.exceptions.*;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.*;
import static java.lang.System.out;

import java.util.Scanner;

/**
 *
 * @author Tobias
 */


public class Controller {
    private int gear;
    
    
    public Controller(){
        this.gear = 0;
    }
    
    /**
     * Controller the constructor for the controller class
     * @param gear depending on this value the program will either read a 
     * file or read input from the user.
     */
    public Controller(int gear){
        this.gear = gear;
    }
    
    /**
     * run function handles the running of the program 
     * @param args contains the address for in and output files required if the
     * user wishes to run the program with an in- and output file.
     * If the user wishes the program to run in "user-input mode", the 
     * appropriate functions to evaluate the expression(s) will be called for.
     */
  
    public void run(String args[]){
        Scanner input = new Scanner(System.in);
        Menu menu = new Menu();
        String line;
        Double d;
        
        if(gear != 0 && gear != 2) 
        {
            System.out.println("Syntax: java Calculator " + args[0]);
            System.exit(1);
        }
        
        
        if(this.gear == 0){
            while(true){
                menu.printMenu();
                line = input.nextLine();
                if ("".equals(line)) System.exit(1);
                Calculate calc = new Calculate(line);
                d = calc.CalculationMagic();
                if(d != null)
                    System.out.println("Resultat: " + d);
            }
        }
        else{
            try{
                File inFile = new File(args[0]);
                File outFile = new File(args[1]);
                FileWriter out = new FileWriter(outFile);

                
                Scanner in = new Scanner(inFile);
                while(in.hasNextLine()){
                    Calculate calc = new Calculate(in.nextLine());
                    d = calc.CalculationMagic();
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
    
}
