/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial.frameandlabeldemo2;
import javax.swing.*;

class MyFrame {
    MyFrame(String text, int x,int y) {
        JFrame frm = new JFrame(" Window with label");
        frm.setBounds(x, y, 250, 120);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        ImageIcon icn = new ImageIcon("D:\\Java\\Projects\\Examples\\FrameAndLabelDemo2\\tmp\\redshd.gif");
        JLabel lbl = new JLabel(text, icn, JLabel.CENTER);
        frm.add(lbl);
        
        frm.setVisible(true);
    }
}
/**
 *
 * @author DELL
 */
public class FrameAndLabelDemo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new MyFrame(" Label with pictogram!", 300, 400);
    }
    
}
