/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupp2.calculator.controller;

import grupp2.calculator.model.RPNCalculator;
import grupp2.calculator.exceptions.*;
import grupp2.calculator.view.FileInterface;
import grupp2.calculator.view.IProgramInterface;
import grupp2.calculator.view.UserInterface;
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
    private int commandLineParameterCount;
    private String arguments[];
    
    
    public Controller(){
        this.commandLineParameterCount = 0;
    }
    
    /**
     * Controller the constructor for the controller class
     * @param gear depending on this value the program will either read a 
     * file or read input from the user.
     */
    public Controller(int gear, String args[]){
        this.commandLineParameterCount = gear;
        arguments = args;
    }
    
    public Controller(int gear){
        commandLineParameterCount = gear;
    }
    
    /**
     * run function handles the running of the program 
     * @param args contains the address for in and output files required if the
     * user wishes to run the program with an in- and output file.
     * If the user wishes the program to run in "user-input mode", the 
     * appropriate functions to evaluate the expression(s) will be called for.
     */
  
    public void run(){
        IProgramInterface view;
        if(commandLineParameterCount != 0 && commandLineParameterCount != 2) 
        {
            System.out.println("Syntax: java Calculator " + arguments[0]);
            System.exit(1);
        }
        if(commandLineParameterCount == 0){
            view = new UserInterface();
            view.runProgram(arguments);
        }else{
            view = new FileInterface();
            view.runProgram(arguments);
        }
    
    }
    
}
