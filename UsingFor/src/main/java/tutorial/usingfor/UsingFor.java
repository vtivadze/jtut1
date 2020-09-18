/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial.usingfor;
import javax.swing.*;

/**
 *
 * @author web
 */
public class UsingFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int iteratorBoundary, i, sum = 0;
        
        iteratorBoundary = Integer.parseInt(JOptionPane.showInputDialog("Enter a sum upper boundary:"));
        String messageText = "The sum of natural numbers from 1 to " + iteratorBoundary + ": ";
        
        for (i = 1; i <= iteratorBoundary; i++) {
            sum += i;
        }
        
        JOptionPane.showMessageDialog(null, messageText + sum);
        
    }
    
}
