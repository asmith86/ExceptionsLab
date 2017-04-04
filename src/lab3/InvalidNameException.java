/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Alex
 */
public class InvalidNameException extends IllegalArgumentException {
    private final static String MSG = "The name you have entered is Invalid";
    
    public InvalidNameException(){
        super(MSG); //MSG has to be static in order to be used in the constructor.
    }
    
    public InvalidNameException(String message) {
		
		super(MSG);
	}
    
     public InvalidNameException(String message, Exception cause) {
		
		super(MSG);
	}
}
