/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial.usinginteger;
import javax.swing.*;

/**
 *
 * @author web
 */
public class UsingInteger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int Number = 321;
        String NotANumber = "321";
        int ANumber = Integer.parseInt(NotANumber);
        String title1 = "Command Number + NotANumber";
        String title2 = "Command Number + ANumber";
        int type1 = JOptionPane.ERROR_MESSAGE;
        int type2 = JOptionPane.WARNING_MESSAGE;
        JOptionPane.showMessageDialog(null, Number + NotANumber, title1, type1);
        JOptionPane.showMessageDialog(null, Number + ANumber, title2, type2);
    }
    
}
