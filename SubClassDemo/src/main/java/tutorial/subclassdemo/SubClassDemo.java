/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial.subclassdemo;

class SuperClass {
    int number;
    String name;
    
    void setNumber(int n) {
        number = n;
    }
}

class SubClass extends SuperClass {
    char symbol;
    
    void setAll(int n, String txt, char s) {
        setNumber(n);
        name = txt;
        symbol = s;
    }
    
    void show() {
        System.out.println("Number field: " + number);
        System.out.println("String field: " + name);
        System.out.println("Symbol field: " + symbol);
    }
}

/**
 *
 * @author web
 */
public class SubClassDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.setAll(100, "TEXT", 'A');
        obj.show();
        
        obj.setNumber(20);
        obj.name = "NEW";
        obj.show();
    }
    
}
