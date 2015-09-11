/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grupp2.calculator.model;

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
        
        System.out.println(exp);
        
        while(readExp.hasNext()){
            bucket.set(readExp.next());
        }
        Expression exp = new Expression();

        organizeExp(bucket, exp);
        
    }
    
    private int organizeExp(ISecretStorage bucket, Expression exp){
        int result;
        Double d;
        String token;
        
        while(!bucket.isEmpty()){
            switch(token = bucket.get()){
                    case "+":
                        Expression expAdd = new Expression();
                        organizeExp(bucket, expAdd);
                        expAdd.setOperator(token);
                        break;
                    case "-":
                        Expression expSub = new Expression();
                        expSub.setOperator(token);
                        organizeExp(bucket, expSub);
                        break;
                    case "/":
                        Expression expDiv = new Expression();
                        expDiv.setOperator(token);
                        organizeExp(bucket, expDiv);
                        break;
                    case "*":
                        Expression expMult = new Expression();
                        expMult.setOperator(token);
                        organizeExp(bucket, expMult);
                        break;
                    case "%":
                        Expression expMod = new Expression();
                        expMod.setOperator(token);
                        organizeExp(bucket, expMod);
                        break;
                    default:


                        try{
                          d = Double.parseDouble(token);
                          if(exp.isRightFree())
                              exp.setRight(d);
                          else
                              exp.setLeft(d);
    

                        }
                        catch(NumberFormatException e){
                            System.out.println("Error: Not a number");
                        }

                        break;
            }
            }
        return result;
    }
}
