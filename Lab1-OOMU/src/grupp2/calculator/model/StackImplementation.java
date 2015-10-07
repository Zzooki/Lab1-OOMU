package grupp2.calculator.model;

import java.util.Stack;

/**
 * StackImplementation Class is the hidden implementation for
 * IstorageImplementation interface.
 * @author Rasmus
 */

public class StackImplementation implements IStorageImplementation{
    private Stack<Token> stack = new Stack<>();
    
    @Override
    public void SecretStorage(){
    }
    
    @Override    
    public void set(Token s){
        stack.push(s);
    }
    
    @Override
        public Token get(){      
        return stack.pop();
    }
    
    @Override
    public boolean isEmpty(){
        return stack.empty();
    }
    @Override
    public void cleanStorage(){
        while(!this.isEmpty()){
            this.get();
        }
    }
    
    
    
}
