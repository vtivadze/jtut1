/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.usingframesdemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class TextInputFrame implements ActionListener {
    private JFrame frame;
    private JLabel enter;
    private JTextField tf;
    private JButton btYes, btNo;
    private String name;
    
    TextInputFrame(String msg) {
        int width = 300, height = 150;
        frame = new JFrame("The window for inputting a text (name)...");
        frame.setBounds(400, 300, width, height);
        frame.setLayout(null);
        
        enter = new JLabel(msg, JLabel.LEFT);
        enter.setBounds(10, 10, width - 20, height / 6);
        
        tf = new JTextField(frame.getWidth() - 20);
        tf.setBounds(10, enter.getHeight() + 5, enter.getWidth(), height / 6);
        
        btYes = new JButton("I confirm");
        btYes.setBounds(10, height / 2 + 10, (width -30) / 2, height / 6);
        btYes.setFocusPainted(false);
        
        btNo = new JButton("Finish");
        btNo.setBounds( (width - 30) / 2 + 18, height / 2 + 10, (width - 30) / 2, height / 6);
        btNo.setFocusPainted(false);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.add(enter);
        frame.add(tf);
        frame.add(btYes);
        frame.add(btNo);
        
        frame.setResizable(false);
        
        btYes.addActionListener(this);
        btNo.addActionListener(this);
        
        frame.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        String btName = ae.getActionCommand();
        
        if (btName.equalsIgnoreCase(btYes.getText())) {
            name = tf.getText();
            frame.setVisible(false);
            IntInputFrame.show("How old are you? Specify your age (years):", name);
        } else {
            System.exit(0);
        }
    }
    
    static void show(String txt) {
        new TextInputFrame(txt);
    }
}

class IntInputFrame implements ActionListener, KeyListener {
    private JFrame frame;
    private JLabel enter;
    private JButton btYes, btNo;
    private JTextField tf;
    private String name;
    private int age;
    
    IntInputFrame(String msg, String name) {
        this.name = new String(name);
        int width = 300, height = 150;
        
        frame = new JFrame("The window for inputting a number (age)...");
        frame.setBounds(400, 300, width, height);
        frame.setLayout(null);
        
        enter = new JLabel(msg, JLabel.LEFT);
        enter.setBounds(10, 10, width - 20, height /6);
        
        tf = new JTextField(frame.getWidth() - 20);
        tf.setBounds(10, 10, width - 20, height / 6);
        
        tf = new JTextField(frame.getWidth() - 20);
        tf.setBounds(10, enter.getHeight() + 5, enter.getWidth(), height / 6);
        tf.addKeyListener(this);
        
        btYes = new JButton("I confirm");
        btYes.setBounds(10,  height / 2 + 10, (width - 30) / 2, height / 6);
        btYes.setEnabled(false);
        
        btNo = new JButton("Finish");
        btNo.setBounds( (width - 30) / 2 + 18, height / 2 + 10, (width - 30) / 2, height / 6);
        btNo.setFocusPainted(false);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.add(enter);
        frame.add(tf);
        frame.add(btYes);
        frame.add(btNo);
        
        btYes.addActionListener(this);
        btNo.addActionListener(this);
        
        frame.setVisible(true);
    }
    
    public void keyReleased(KeyEvent ke) {
        try {
            Integer.parseInt(tf.getText());
            btYes.setEnabled(true);
        } catch (Exception e) {
            btYes.setEnabled(false);
        }
    }
    
    public void keyPressed(KeyEvent ke) {}
    public void keyTyped(KeyEvent ke) {}
    
    public void actionPerformed(ActionEvent ae) {
        String btName = ae.getActionCommand();
        
        if (btName.equalsIgnoreCase(btYes.getText())) {
            age = Integer.parseInt(tf.getText());
            frame.setVisible(false);
            String msg = "Good morning, " + name + "!\n";
            msg += "Your age is " + age + "years!";
            MessageFrame.show(msg);
        } else {
            System.exit(0);
        }
    }
    
    static void show(String txt, String name) {
        new IntInputFrame(txt, name);
    }
}

class MessageFrame implements ActionListener {
    private JFrame frame;
    private JLabel il;
    private JLabel message;
    private JButton button;
    
    MessageFrame(String msg) {
        int width = 350, height = 150;
        ImageIcon img = new ImageIcon("C:\\Users\\b_tec\\Documents\\NetBeansProjects\\UsingFramesDemo\\files\\java.gif");
        
        frame = new JFrame("Message...");
        frame.setBounds(400, 300, width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        
        Image icon = frame.getToolkit().getImage("C:\\Users\\b_tec\\Documents\\NetBeansProjects\\UsingFramesDemo\\files\\youtube.png");
        il = new JLabel(img);
        int w = img.getIconWidth();
        int h = img.getIconHeight();
        il.setBounds(10, 10, w, h);
        
        message = new JLabel("<html>" + msg.replace("\n", "<br>") + "</html>", JLabel.LEFT);
        message.setBounds(w + 20, 10, width - 30 - w, height / 2 - 10);
        
        frame.add(il);
        frame.add(message);
        
        button = new JButton("Is read!");
        button.setBounds(width / 4, 3 * height / 5, width / 2, height / 6);
        button.setFocusPainted(false);
        button.addActionListener(this);
        
        frame.add(button);
        frame.setResizable(false);
        frame.setIconImage(icon);
        frame.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        System.exit(0);
    }
    
    static void show(String txt) {
        new MessageFrame(txt);
    }
}
/**
 *
 * @author DELL
 */
public class UsingFramesDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TextInputFrame.show("What is your name? Enter name:");
    }
    
}
