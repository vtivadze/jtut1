/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial.frameandbuttondemo;
import javax.swing.*;
import java.awt.event.*;

class MyFrame implements ActionListener {
    MyFrame(String text, int x, int y) {
        JFrame frm = new JFrame(" Window with label and button");
        frm.setBounds(x, y, 360, 200);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        ImageIcon icn = new ImageIcon("D:\\Java\\Projects\\Examples\\FrameAndButtonDemo\\tmp\\javalogo.gif");
        JLabel lbl = new JLabel(text, icn, JLabel.CENTER);
        lbl.setBounds(10, 10, 330, 100);
        
        JButton btn = new JButton("Noted");
        btn.setBounds(90, 120, 180, 30);
        btn.addActionListener(this);
        
        frm.setLayout(null);
        
        frm.add(lbl);
        frm.add(btn);
        
        frm.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent AEobj) {
        System.exit(0);
    }
}
/**
 *
 * @author DELL
 */
public class FrameAndButtonDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new MyFrame(" Window with label, pictogram and button!", 400, 250);
    }
    
}
