/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial.classdemo3;
import javax.swing.*;

class MyClass {
    int num;
    char symb;
    String text;
    
    void showText() {
        String str = "Object fields' values:\n";
        str += "num = " + num + "\n";
        str += "symb = " + symb + "\n";
        str += "text = " + text + "\n";
        
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
public class ClassDemo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass();
        
        obj1.set(10, 'A', "Hello everybody!");
        obj2.set(200, 'b', "Hello else time more!");
        
        obj1.showText();
        obj2.showText();
    }
    
}
