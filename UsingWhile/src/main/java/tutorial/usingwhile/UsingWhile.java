/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial.usingwhile;
import javax.swing.*;
/**
 *
 * @author web
 */
public class UsingWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int count, i = 1, j = 1, s1 = 0, s2 = 0;
        
        count = Integer.parseInt(JOptionPane.showInputDialog("Enter sum boundary:"));
        
        String text = "Sum of natural numbers from 1 to " + count + ".\n";
        String str1  = "Operator while: ";
        String str2 = "Operator do-while: ";
        
        while (i <= count) {
            s1 += i;
            i++;
        }
        
        do {
            s2 += j;
            j++;
        } while (j <= count);
        
        str1 += s1 + "\n";
        str2 += s2;
        
        JOptionPane.showMessageDialog(null, text + str1 + str2);
    }
    
}
