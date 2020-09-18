/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial.makechoice;
import javax.swing.*;

/**
 *
 * @author web
 */
public class MakeChoice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number:"));
        String text = number % 2 == 0 ? "even" : "odd";
        JOptionPane.showMessageDialog(null, "You entered the " + text + " number!");
    }
    
}
