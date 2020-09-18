/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial.argsdemo;
import javax.swing.*;

class MyClass {
    int number;
    char symb;
    
    MyClass(int number, char symb) {
        this.number = number;
        this.symb = symb;
    }
    
    void show() {
        System.out.println("Object fields: " + number + " and " + symb);
    }
}
/**
 *
 * @author web
 */
public class ArgsDemo {
    static void MakeChange(MyClass obj) {
        obj.number++;
        obj.symb++;
        
        String text = "Argument is an object: fields " + obj.number + " and " + obj.symb;
        System.out.println(text);
    }
    
    static void MakeChange(int number, char symb) {
        number++;
        symb++;
        
        String text = "Arguments are of base types: values " + number + " and " + symb;
        System.out.println(text);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyClass obj = new MyClass(1, 'a');
        obj.show();
        
        MakeChange(obj);
        obj.show();
        
        MakeChange(obj.number, obj.symb);
        obj.show();
    }
    
}
