/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grupp2.calculator.model;

import Grupp2.calculator.view.*;

import java.util.Scanner;
import java.util.Set;
/**
 *
 * @author Darko
 */
public class Calculate {
    String exp;
    
    
    public Calculate(String exp){
        this.exp = exp;
    }
    
    public void calculateExp(){
        double d;
        Scanner readExp = new Scanner(exp);
        ISecretStorage bucket = new ISecretStorage();
        Result result = new Result(); 
        System.out.println(exp);
        
        while(readExp.hasNext()){
            bucket.set(readExp.next());
        }
        Expression newExp = new Expression();

        d = organizeExp(bucket, newExp);
        result.printResult(d);
       
        
    }
    
    private Double organizeExp(ISecretStorage bucket, Expression exp){
        Double result = 0.0;
        Double d;
        String token;
        
        while(!bucket.isEmpty()){
            switch(token = bucket.get()){
                    case "+":
                        Expression expAdd = new Expression();
                        expAdd.setOperator(token);
                        result = organizeExp(bucket, expAdd);
                        break;
                    case "-":
                        Expression expSub = new Expression();
                        expSub.setOperator(token);
                        result = organizeExp(bucket, expSub);
                        break;
                    case "/":
                        Expression expDiv = new Expression();
                        expDiv.setOperator(token);
                        result= organizeExp(bucket, expDiv);
                        break;
                    case "*":
                        Expression expMult = new Expression();
                        expMult.setOperator(token);
                        result = organizeExp(bucket, expMult);
                        break;
                    case "%":
                        Expression expMod = new Expression();
                        expMod.setOperator(token);
                        result = organizeExp(bucket, expMod);
                        break;
                    default:


                        try{
                          d = Double.parseDouble(token);
                          if(exp.isRightFree()){
                              exp.setRight(d);
                              result = organizeExp(bucket, exp);
                          }
                          else if (exp.isLeftFree()){
                              exp.setLeft(d);
                              switch(exp.getOperator()){
                                  case '+':
                                      return(exp.getLeftValue() + exp.getRightValue());
                                  case '*':
                                      return(exp.getLeftValue() * exp.getRightValue());
                                  case '/':
                                      return(exp.getLeftValue() / exp.getRightValue());
                                   case '-':
                                       return(exp.getLeftValue() -  exp.getRightValue());
                                   case '%':
                                       return(exp.getLeftValue() % exp.getRightValue());
                                          
                              }
                          }
                          //else
                             //checkUserInput();
    

                        }
                        catch(NumberFormatException e){
                            System.out.println("Error: Not a number");
                        }

                        break;
            }
        }
        return(result);
    }
}
