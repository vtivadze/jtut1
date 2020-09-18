/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial.newsimplearray;
import javax.swing.*;
/**
 *
 * @author web
 */
public class NewSimpleArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, m;
        String text = "Two-dimensional array with random numbers:";
        
        n = Integer.parseInt(JOptionPane.showInputDialog("Indicate count of array rows:"));
        m = Integer.parseInt(JOptionPane.showInputDialog("Indicate count of array columns:"));
        
        int[][] nums = new int[n][m];
        
        for (int i = 0; i < n; i++) {
            text += "\n";
            for (int j = 0; j < m; j++) {
                nums[i][j] = (int) (10 * Math.random());
                text += nums[i][j] + "  ";
            }
        }
        
        JOptionPane.showMessageDialog(null, text);
    }
    
}
