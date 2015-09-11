/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grupp2.calculator.controller;

import Grupp2.calculator.model.*;
import Grupp2.calculator.view.*;
import Grupp2.calculator.exceptions.*;

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
    public void run(){
        Scanner input = new Scanner(System.in);
        Menu menu = new Menu();
        
        if(gear != 0 || gear != 2)
            //Exit();
        
        while(true){
            if(this.gear == 0){
                menu.printMenu();
                Calculate calc = new Calculate(input.nextLine());
                calc.calculateExp();
                
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
