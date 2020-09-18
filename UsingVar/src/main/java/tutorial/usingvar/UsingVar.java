/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial.usingvar;
import javax.swing.*;

/**
 *
 * @author web
 */
public class UsingVar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name = "Vakhtang Otari Tivadze";
        int age = 46;
        char category = 'B';
        String text = "Driver: " + name;
        text = text + "\n" + "Age: " + age;
        text = text + '\n' + "Licence Category: " + category;
        JOptionPane.showMessageDialog(null, text);
    }
    
}
