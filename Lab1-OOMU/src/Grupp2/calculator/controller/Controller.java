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
 * @author Darko
 */

    /**
     * @param Controller class handles the running of the program and 
     * creates a seperation between the beautiful craftmanship worthy to be
     * called "implementation" and the user interface.
     */
public class Controller {
    private int gear;
    
    /**
     * @param Controller the constructor for the controller class
     * handles the value "gear" depending on this value the program
     * will either read a file or read input from the user.
     */
    
    public Controller(){
        this.gear = 0;
    }
    public Controller(int gear){
        this.gear = gear;
    }
    
    /**
     * @param run(String args[]) this function is called for with the args
     * array, cause it handles the running of the programm and will need the 
     * source address for in and output files from the user incase user wishes
     * to run the program with an in/output file. If that's not the case the
     * program will run in "user-input mode", and the appropriate functions to
     * evaluate the expression entered by the user will be called for.
     */
    public void run(String args[]){
        Scanner input = new Scanner(System.in);
        Menu menu = new Menu();
        String line;
        double d;
        
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
                    out.write(d + "\n");
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
