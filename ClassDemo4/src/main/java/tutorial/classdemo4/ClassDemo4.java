/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial.classdemo4;
import javax.swing.*;

class MyClass {
    int num;
    char symb;
    String text;
    
    MyClass(int n, char s, String str) {
        set(n, s, str);
        showText();
    }
    
    void showText() {
        String str = "Object fields' values:\n";
        str += "num = " + num +"\n";
        str += "symb = " + symb +"\n";
        str += "text = " + text;
        
        JOptionPane.showMessageDialog(null, str);
    }
    
    void set(int n, char s, String str) {
        num = n;
        symb = s;
        text = str;
    }
}
/**
 *
 * @author web
 */
public class ClassDemo4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyClass obj = new MyClass(15, 'Y', "Simple text");
    }
    
}
