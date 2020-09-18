/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial.overridedemo;

class A {
    int first;
    
    void set() {
        first = 0;
        System.out.println("Zero value of field");
    }
    
    void set(int n) {
        first = n;
        show();
    }
    
    void show() {
        System.out.println("Field " + first + ".");
    }
    
    void showAll() {
        System.out.println("All the fields - on the screen!");
        show();
    }
}

class B extends A {
    int second;
    
    void set(int n) {
        first = n;
        second = n;
        
        show();
    }
    
    void set(int m, int n) {
        second = n;
        super.set(m);
    }
    
    void show() {
        System.out.println("Fields " + first + " and " + second + ".");
    }
}

/**
 *
 * @author web
 */
public class OverrideDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A objA = new A();
        
        objA.set();
        objA.set(100);
        
        B objB = new B();
        
        objB.set();
        objB.second = -1;
        objB.show();
        
        objB.set(200);
        objB.set(1, 2);
                
        objA.showAll();
        objB.showAll();
    }
    
}
