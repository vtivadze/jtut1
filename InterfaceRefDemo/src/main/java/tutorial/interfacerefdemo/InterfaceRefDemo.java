/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial.interfacerefdemo;

interface Base {
    void show();
}

class A implements Base {
    public void show() {
        System.out.println("This is method of the class A");
    }
}

class B implements Base {
    public void show() {
        System.out.println("This is a method of the class B");
    }
}
/**
 *
 * @author web
 */
public class InterfaceRefDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Base ref;
        
        ref = new A();
        ref.show();
        
        ref = new B();
        ref.show();
    }
    
}
