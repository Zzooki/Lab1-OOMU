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

import java.util.Scanner;

/**
 *
 * @author Darko
 */
public class Controller {
    private int gear;
    
    public Controller(){
        this.gear = 0;
    }
    public Controller(int gear){
        this.gear = gear;
    }
    public void run(String args[]){
        Scanner input = new Scanner(System.in);
        Menu menu = new Menu();
        double d;
        
        if(gear != 0 && gear != 2) System.exit(1);
        
        while(true){
            if(this.gear == 0){
                menu.printMenu();
                Calculate calc = new Calculate(input.nextLine());
                d = calc.CalculationMagic();
                System.out.println("Resultat: " + d);
            }
            else{
                try{
                Scanner in = new Scanner(new FileInputStream(args[0]));
                Calculate calc = new Calculate((String)in.next());
                d = calc.CalculationMagic();
                
                FileWriter out = new FileWriter(new File(args[1]));
                out.write(d + "\n");
                }
                catch(FileNotFoundException e){
                    System.err.println("Diz file does not exist!");
                }
                catch(IOException q){
                    System.err.println("Something iz wrong do right!");
                }
                
                
            }
        }
        
        /* Loopa
            Hämta nästa RPN-rad (från användaren eller källfilen) 
            Om RPN-raden är null eller en en tom sträng
                 Avsluta Annars
            Be kalkylatorn att beräkna resultatet av RPN-uttrycket 
            Presentera resultatet (till användaren eller destinationsfilen)
        */
    }
    
}
