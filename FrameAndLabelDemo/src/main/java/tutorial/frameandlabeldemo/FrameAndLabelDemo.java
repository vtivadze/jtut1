/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial.frameandlabeldemo;
import javax.swing.*;

class MyFrame {
    MyFrame() {
        JFrame frm = new JFrame(" Window With Label");
        frm.setBounds(400, 300, 180, 100);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel lbl = new JLabel(" Hello to everybody!");
        frm.add(lbl);
        frm.setVisible(true);
    }
}
/**
 *
 * @author DELL
 */
public class FrameAndLabelDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new MyFrame();
    }
    
}
