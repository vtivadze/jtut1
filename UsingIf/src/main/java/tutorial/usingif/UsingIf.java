/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial.usingif;
import javax.swing.*;

/**
 *
 * @author web
 */
public class UsingIf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double numerator, denominator;
        String windowTitle="Dividing numbers";
        String messageText = "Result of dividing: ";
        int messageType;
        
        numerator = Double.parseDouble(JOptionPane.showInputDialog("Numerator:"));
        denominator = Double.parseDouble(JOptionPane.showInputDialog("Denominator:"));
        
        if (denominator != 0) {
            messageType = JOptionPane.PLAIN_MESSAGE;
            messageText = messageText + numerator + "/" + denominator + "=" + numerator / denominator;
        } else {
            messageType = JOptionPane.ERROR_MESSAGE;
            messageText = messageText + "Division on zero!";
        }
        
        JOptionPane.showMessageDialog(null, messageText, windowTitle, messageType);
    }
    
}
