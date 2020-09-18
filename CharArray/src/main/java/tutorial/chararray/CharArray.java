/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial.chararray;
import javax.swing.*;
/**
 *
 * @author web
 */
public class CharArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int size = 2 + (int)(Math.random() * 3);
        int n;
        char s = 'a';
        String text = "\"Raggy\" symbol array:";
        char[][] symbs = new char[size][];
        
        for (int k = 0; k < size; k++) {
            n = 1 + (int)(Math.random() * 8);
            symbs[k] = new char[n];
        }
        
        for (int i = 0; i < symbs.length; i++) {
            text += "\n|";
            for (int j = 0; j <  symbs[i].length; j++) {
                symbs[i][j] = s;
                s++;
                text += symbs[i][j] + " | ";
            }
        }
        
        JOptionPane.showMessageDialog(null, text);
    }
    
}
