/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial.newframedemo;
import javax.swing.*;
class NewFrame {
    NewFrame() {
        JFrame MyFrame = new JFrame("New Window");
        MyFrame.setSize(300, 200);
        MyFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyFrame.setVisible(true);
    }
}
/**
 *
 * @author DELL
 */
public class NewFrameDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new NewFrame();
    }
    
}
