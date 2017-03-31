/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab0;

/**
 *
 * @author asmith86
 */
public class MandatoryStringException extends IllegalArgumentException {
    
    private final static String msg = "Method Argument is Mandatory."; 
    //must be static to use in constructor.

    public MandatoryStringException() {
        super(msg);
    }

    public MandatoryStringException(String s) {
        super(s);
    }

    public MandatoryStringException(String message, Throwable cause) {
        super(msg, cause);
    }

    public MandatoryStringException(Throwable cause) {
        super(cause);
    }
    
    
    
}
