/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial.classdemo5;
import javax.swing.*;

class MyClass {
    int num;
    char symb;
    String text;
    
    MyClass() {
        set();
        showText();
    }
    
    MyClass(int n) {
        set(n);
        showText();
    }
    
    MyClass(char s) {
        set(s);
        showText();
    }
    
    MyClass(int n, char s, String str) {
        set(n, s, str);
        showText();
    }
    
    void showText() {
        String str = "Object fields' values:\n";
        str += "num = " + num + "\n";
        str += "symb = " + symb + "\n";
        str += "text = " + text + "\n";
        
        JOptionPane.showMessageDialog(null, str);
    }
    
    void set() {
        num = 0;
        symb = 'a';
        text = "No arguments";
    }
    
    void set(int n) {
        num = n;
        symb = 'b';
        text = "Integer argument";
    }
    
    void set(char s) {
        num = 1;
        symb = s;
        text = "Argument of type char";
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
public class ClassDemo5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass(2);
        MyClass obj3 = new MyClass('Z');
        MyClass obj4 = new MyClass(3, 'A', "Three arguments");
    }
    
}
