package grupp2.calculator.model;


import grupp2.calculator.exceptions.*;
import java.util.Scanner;
/**
 * RPNCalculator class is the class that handles the creation of the token objects
 * as well as creating and storing it into the storage.
 * @author Thires
 */

public class RPNCalculator {
    IStorageImplementation storage;
    
    /**
     * RPNCalculator constructor creates a Calculate object and contains the 
     * data structure which stores the tokens.
     */
    public RPNCalculator(){
        this.storage = new StackImplementation(); 
    }
    
    /**
     * CalculateResult method used for deviding the expression into tokens and the
     * appropriate objects are created depending on if the token is one of the 
     * different operators or an operand. The method stores theese in the 
     * storage and thereafter the expression is evaluated. This method also
     * catches the possible errors that can occur and calls for the functions 
     * handling the error.
     * @param exp is the parameter for the expression that needs to be evaluated.
     * @return the method returns a double that's the result of the evaluated 
     * expression
     */
    public Double CalculateResult(String exp){
               
        Scanner readExp = new Scanner(exp);
        Double d = null;
        Token o = null;
        
        

        try{
            while(readExp.hasNext()){   
                String s = readExp.next();


                if(checkIfOperator(s)){
                    switch (s) {
                        case "+":
                            o = new AddOp();
                            break;
                        case "-":
                            o = new SubOp();
                            break;   
                        case "*":
                            o = new MultiplicationOp();
                            break;
                        case "/":
                            o = new DivisionOp();
                            break;
                        case "%":
                            o = new ModOp();
                            break;
                    }
                }else if (checkIfOperand(s))
                    o = new Operand(s);
                else
                    throw new UserInputException(s);

                storage.set(o);
            }
            Token t; //= new Token
            t = (storage.get());
            d = t.calcExp(storage);
            if(!storage.isEmpty())
                throw new InvalidOperationException("To few operators..");
            else
                return(d);

        }catch(NumberFormatException wrong){
            System.err.println(wrong);
        }catch(UserInputException h){
            System.err.println(h);
        }catch(InvalidOperationException h){
            System.err.println(h);
        }
        
        return null;
        
    }
    
    /**
    * checkIfOperator function
    * @return returns true if the token is either "+", "-", "/", "*" or "%".
    */
    private boolean checkIfOperator(String s){
        return "+".equals(s) || "-".equals(s) || "/".equals(s) || "*".equals(s) ||"%".equals(s);
    }
    
    /**
     * checkIfOperand function 
     * @return returns true if the token is a numeric value.
     */
    public boolean checkIfOperand(String s){
        try{  
          Double d = Double.parseDouble(s);  
        }  
        catch(NumberFormatException nfe){  
          return false;  
        }  
        return true;
    }
}
    

    
    



