/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial.simplearray;
import javax.swing.*;
/**
 *
 * @author web
 */
public class SimpleArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i, size;
        String text = "Array with the odd numbers:\n";
        
        size = Integer.parseInt(JOptionPane.showInputDialog("Indicate array size:"));
        int[] nums = new int[size];
        
        for(i = 0; i < size; i++) {
//            nums[i] = i * 2 + 1;
            text += nums[i] + "  ";
        }
        
        JOptionPane.showMessageDialog(null, text);
    }
    
}
