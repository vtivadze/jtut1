/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial.usingstatdemo;
import javax.swing.*;

class MyClass {
    static int N1;
    int N2;
    
    MyClass(int n1, int n2) {
        N1 = n1;
        N2 = n2;
        
        String text = "It was created a new object!\n";
        text += "Static field: " + N1 + "\n";
        text += "Not static field: " + N2;
        
        JOptionPane.showMessageDialog(null, text);
    }
    
    void show() {
        String text = "Object fields!\n";
        text += "Static field: " + N1 + "\n";
        text += "Not static field: " + N2 + "\n";
        
        JOptionPane.showMessageDialog(null, text);
    }
}
        
/**
 *
 * @author web
 */
public class UsingStatDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyClass A = new MyClass(10, 200);
        MyClass.N1 = -50;
        A.show();
        
        MyClass B = new MyClass(1, 2);
        A.show();
        B.N1 = -1;
        B.N2 = -2;
        A.show();
    }
    
}
