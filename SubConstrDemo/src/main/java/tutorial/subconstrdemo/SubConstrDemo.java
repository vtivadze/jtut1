/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial.subconstrdemo;

class A {
    int number;
    char symbol;
    
    A() {
        number = 0;
        symbol = 'A';
        
        System.out.println("Constructor wihout arguments!");
        show();
    }
    
    A(int n) {
        number = n;
        symbol = 'B';
        
        System.out.println("Constructor with one argument!");
        show();
    }
    
    A(int n, char s) {
        number = n;
        symbol = s;
        
        System.out.println("Constructor with two arguments!");
        show();
    }
    
    void show() {
        System.out.println("Fields " + number + " and " + symbol + ".");
    }
}

class B extends A {
    String text;
    
    B() {
        super();
        text = "Without arguments";
        showText();
    }
    
    B(String txt) {
        super(txt.length());
        text = txt;
        showText();
    }
    
    B(int n, char s, String txt) {
        super(n, s);
        text = txt;
        showText();
    }
    
    void showText() {
        System.out.println("Text field \"" + text + "\".");
    }
}
/**
 *
 * @author web
 */
public class SubConstrDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new B();
        new B("One argument");
        new B(100, 'F', "Three arguments");
    }
    
}
