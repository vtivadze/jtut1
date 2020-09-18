/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial.classdemo;
import javax.swing.*;

class MyClass {
    int num;
    char symb;
    String text;
}

/**
 *
 * @author web
 */
public class ClassDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        
        obj.num = 12;
        obj.symb = 'A';
        obj.text = "String field";
        
        String str = "Object field values:\n";
        str += "num = " + obj.num + "\n";
        str += "symb = " + obj.symb + "\n";
        str += "text = " + obj.text;
        
        JOptionPane.showMessageDialog(null, str);
    }
    
}
