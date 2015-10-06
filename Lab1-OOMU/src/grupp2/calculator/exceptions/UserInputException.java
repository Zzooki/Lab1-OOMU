package grupp2.calculator.exceptions;


/**
 * UserInputException Class handles the error which gets thrown when the users 
 * enters any character that's not considered as valid input for example letters
 * between a-z.
 * @author Rasmus
 */

public class UserInputException extends Exception{
    
    /**
     * CheckUserInput method handles exceptions that gets thrown when the user 
     * enters an invalid token into the calculator, for example characters a-z.
     * @param c is the parameter for the error occurred.
     */
    public UserInputException(String c){
        super("Invalid Token: " + c);
    }
    
}
