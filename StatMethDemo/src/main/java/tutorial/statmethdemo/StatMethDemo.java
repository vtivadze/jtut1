/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial.statmethdemo;
import javax.swing.*;

class MyMath {
    final static double PI = 3.14159265;
    
    static double sin(double x, int n) {
        double s = 0, q = x;
        int i;
        
        for (i = 1; i <= n; i++) {
            s += q;
            q *= (-1) * x * x / (2 * i) / (2 * i + 1);
        }
        
        return s + q;
    }
}
/**
 *
 * @author web
 */
public class StatMethDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String text = "Teilor row value for sinus.";
        
        for (int k = 0; k < 5; k++) {
            text += "\nTerms " + (k + 1) + ": ";
            text += "sin(pi/4)=" + MyMath.sin(MyMath.PI/4, k);
        }
        
        JOptionPane.showMessageDialog(null, text);
    }
    
}
