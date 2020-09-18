/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.makecomponentsdemo;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class MyButton extends JButton {
    private MyFrame frame;
    
    MyButton (MyFrame frame, boolean state) {
        super();
        this.frame = frame;
        String fileName;
        String bName;
        
        if (state) {
            fileName = "Yes.png";
            bName = "Yes";
            addActionListener(new HandlerYes(frame));
        } else {
            fileName = "No.png";
            bName = "No";
            addActionListener(new HandlerNo());
        }
        
        fileName = "C:\\Users\\b_tec\\Documents\\NetBeansProjects\\MakeComponentsDemo\\files" + fileName;
        ImageIcon icn = new ImageIcon(fileName);
        setIcon(icn);
        setText(bName);
        setFocusPainted(false);
        
        int w = frame.getWidth() / 4;
        int h = frame.getHeight() / 8;
        setSize(w, h);
        
        int x = frame.getWidth() / 4, y = frame.getHeight() - h - 50;
        if (!state) x += w + 50;
        
        setLocation(x, y);
        
        frame.add(this);
    }
}

class MyIconLabel extends JLabel {
    private MyFrame frame;
    
    MyIconLabel (MyFrame frame) {
        super();
        
        this.frame = frame;
        
        ImageIcon icn = new ImageIcon("C:\\Users\\b_tec\\Documents\\NetBeansProjects\\MakeComponentsDemo\\files\\rabbit.gif");
        setIcon(icn);
        setBounds(5, 15, frame.getWidth() / 4 - 10, frame.getHeight() - 30);
        
        frame.add(this);
    }
}

class MyMenuBar extends JMenuBar {
    private MyFrame frame;
    
    MyMenuBar (MyFrame frame) {
        super();
        this.frame = frame;
        
        JMenu wind = new JMenu("Window");
        JMenuItem apply = new JMenuItem("Confirm");
        JMenuItem exit = new JMenuItem("Exit");
        apply.addActionListener(new HandlerYes(frame));
        exit.addActionListener(new HandlerNo());
        wind.add(apply);
        wind.add(exit);
        add(wind);
        
        JMenu horiz = new JMenu("By Horizontal");
        JMenuItem left = new JMenuItem("To the Left");
        JMenuItem right = new JMenuItem("To the Right");
        JMenuItem hnone = new JMenuItem("No Move");
        left.addActionListener(new MenuHandler(frame, true));
        right.addActionListener(new MenuHandler(frame, true));
        hnone.addActionListener(new MenuHandler(frame, true));
        horiz.add(left);
        horiz.add(right);
        horiz.add(hnone);
        add(horiz);
        
        JMenu vert = new JMenu("By Vertical");
        JMenuItem up = new JMenuItem("To the Up");
        JMenuItem down = new JMenuItem("To the Bottom");
        JMenuItem vnone = new JMenuItem("No Move");
        up.addActionListener(new MenuHandler(frame, false));
        down.addActionListener(new MenuHandler(frame, false));
        vnone.addActionListener(new MenuHandler(frame, false));
        vert.add(up);
        vert.add(down);
        vert.add(vnone);
        add(vert);
        
        setBounds(1, 1, frame.getWidth() - 1, frame.getHeight() / 10);
        frame.add(this);
    }
}

class MyPanel extends JPanel {
    public JLabel HLab;
    public JLabel VLab;
    
    MyPanel() {
        super();
        
        JLabel L1 = new JLabel("By horizontal: ");
        JLabel L2 = new JLabel("By vertical: ");
        HLab = new JLabel("No move");
        VLab = new JLabel("No move");
        setLayout(new GridLayout(2, 2, 3, 3));
        add(L1);
        add(HLab);
        add(L2);
        add(VLab);
    }
}

class MyFrame extends JFrame {
    public MyPanel move;
    private int[] step;
    
    public void setH(int i) {
        step[0] = i;
    }
    
    public void setV(int i) {
        step[1] = i;
    }
    
    MyFrame(String text, int width, int height) {
        super();
        step = new int[] {0, 0};
        setTitle(text);
        setBounds(400, 300, width, height);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        new MyButton(this, true);
        new MyButton(this, false);
        
        new MyMenuBar(this);
        new MyIconLabel(this);
        
        JLabel msg = new JLabel("Would you like to move the window?");
        msg.setBounds(getWidth() / 4, 15, 3 * getWidth() / 4 - 10, getHeight() / 4 - 5);
        
        Font fnt = new Font("Arial", Font.BOLD, 18);
        msg.setFont(fnt);
        add(msg);
        
        move = new MyPanel();
        move.setBounds(msg.getX(), msg.getY() + msg.getHeight() + 1, msg.getWidth(), msg.getHeight());
        add(move);
        
        setResizable(false);
        setVisible(true);
    }
    
    void Handler() {
        setLocation(getX() + step[0], getY() + step[1]);
    }
}

class HandlerNo implements ActionListener {
    public void actionPerformed(ActionEvent ae) {
        System.exit(0);
    }
}

class HandlerYes implements ActionListener {
    private MyFrame frame;
    
    HandlerYes(MyFrame frame) {
        this.frame = frame;
    }
    
    public void actionPerformed(ActionEvent ae) {
        frame.Handler();
    }
}

class MenuHandler implements ActionListener {
    private  MyFrame frame;
    private boolean dir;
    
    MenuHandler(MyFrame frame, boolean dir) {
        this.frame = frame;
        this.dir = dir;
    }
    
    public void actionPerformed(ActionEvent ae) {
        String cmd = ae. getActionCommand();
        
        if (dir) {
            frame.move.HLab.setText(cmd.toLowerCase());
            if (cmd.equalsIgnoreCase("To the Right")) frame.setH(50);
            else if (cmd.equalsIgnoreCase("To the Left")) frame.setH(-50);
            else frame.setH(0);
        } else {
            frame.move.VLab.setText(cmd.toLowerCase());
            if (cmd.equalsIgnoreCase("To the Up")) frame.setV(-50);
            else if (cmd.equalsIgnoreCase("To the Bottom")) frame.setV(50);
            else frame.setV(0);
        }
    }
}


/**
 *
 * @author DELL
 */
public class MakeComponentsDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new MyFrame("Window moving service \"Quick Rabbit\"...", 380, 180);
    }
    
}
