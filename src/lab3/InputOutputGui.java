package lab3;

import javax.swing.JOptionPane;

/**
 * This class is responsible for all input and output in the program.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class InputOutputGui {
    private NameService nameService;

    public InputOutputGui() {
        nameService = new NameService();
    }

    public void startConversation() {
        
        try {
           String fullName = JOptionPane.showInputDialog("Enter full name (use Format: first last):"); 
           String lastName = nameService.extractLastName(fullName);
           String msg = "Assuming you entered it correctly, your last name is: " + lastName;
           JOptionPane.showMessageDialog(null, msg);
        } catch (InvalidNameException ine) {
            JOptionPane.showMessageDialog(null, "You did not enter a name.");
        } catch (ArrayIndexOutOfBoundsException aiobe){
            JOptionPane.showMessageDialog(null, "You've entered bad information.");
        }
        
        
    }
     
}
