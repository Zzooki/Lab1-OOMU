package Grupp2.calculator;

import Grupp2.calculator.controller.Controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 /**
 *
 * @author Darko
 */
public class Calculator {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Controller cont = new Controller(0);
        cont.run();
    }
    
}
