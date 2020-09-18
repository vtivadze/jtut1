/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial.chararraysorting;
import javax.swing.*;
/**
 *
 * @author web
 */
public class CharArraySorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String text = "Initial array: \n";
        int size, i, j;
        
        size = Integer.parseInt(JOptionPane.showInputDialog("Indicate array size:"));

        char[] symbs = new char[size];        
        char s = 'a';
        
        for (i = 0; i < size; i++) {
            symbs[i] = (char)(s + (byte)(Math.random() * 26));
            text += symbs[i] + "  ";
        }
        
        text += "\nAfter sorting:\n";
        
        for (i = 0; i < size; i++) {
            for (j = 0; j < size - i -1; j++) {
                if (symbs[j] > symbs[j+1]) {
                    s = symbs[j+1];
                    symbs[j+1] = symbs[j];
                    symbs[j] = s;
                }
            }
        }
        
        for (i = 0; i < size; i++) {
            text += symbs[i] + "  ";
        }
        
        JOptionPane.showMessageDialog(null, text);
    }
    
}

//  0 1 2 3 4 5 6 7 8 9
//  a b c d e f g h i j
