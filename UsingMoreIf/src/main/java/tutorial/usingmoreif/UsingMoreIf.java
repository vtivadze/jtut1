/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial.usingmoreif;
import javax.swing.*;

/**
 *
 * @author web
 */
public class UsingMoreIf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String userInput, programOutput;
        
        userInput = JOptionPane.showInputDialog("Enter integer number:");
        if (userInput == null) {
            System.exit(0);
        }
        int number = Integer.parseInt(userInput);
        
        if (number < 0 ) {
            programOutput = "You entered negative number!";
        } else if (number > 100) {
            programOutput = "It is a too big number!";
        } else if (number > 10) {
            programOutput = "The number is more then 10!";
        } else {
            programOutput = "The number is between 0 and 10!";
        }
        
        JOptionPane.showMessageDialog(null, programOutput);
    }
    
}
