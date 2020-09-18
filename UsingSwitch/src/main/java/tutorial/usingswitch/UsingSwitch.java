/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial.usingswitch;
import javax.swing.*;

/**
 *
 * @author web
 */
public class UsingSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int userNumber;
        String userInput, messageText;
        
        userInput = JOptionPane.showInputDialog("Enter integer from 0 to 10:");
        userNumber = Integer.parseInt(userInput);
        
        switch(userNumber) {
            case 0:
                messageText = "You entered zero value!";
                break;
            case 1:
                messageText = "You entered singletone value!";
                break;
            case 2:
            case 3:
            case 5:
            case 7:
                messageText = "You entered symple number!";
                break;
            case 4:
            case 6:
            case 8:
            case 10:
                messageText = "You entered even number!";
                break;
            default:
                messageText = "You entered 9 or\na number out of the range!";
        }
        
        JOptionPane.showMessageDialog(null, messageText);
    }
    
}
