/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial.whatisyourname;
import javax.swing.*;

/**
 *
 * @author web
 */
public class WhatIsYourName {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name;
        name = JOptionPane.showInputDialog("Good morning! What is your name?");
        JOptionPane.showMessageDialog(null, "Please to meet you, \n" + name + "!");
    }
    
}
