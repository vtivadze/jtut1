/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial.classdemo2;
import javax.swing.*;

class MyClass {
    int num;
    char symb;
    String text;
    
    String showText() {
        String str = "Object field values:\n";
        str += "num = " + num + "\n";
        str += "symb = " + symb + "\n";
        str += "text = " + text;

        return str;
    }
}

/**
 *
 * @author web
 */
public class ClassDemo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.num = 12;
        obj.symb = 'A';
        obj.text = "String field";
        
        JOptionPane.showMessageDialog(null, obj.showText());
    }
    
}
