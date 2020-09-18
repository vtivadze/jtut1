/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial.abstractdemo;

abstract class Base {
    String operation;
    
    Base (String str) {
        operation = str;
    }
    
    abstract int F(int n);
    
    void  show(int n) {
        System.out.println("Operation: " + operation);
        System.out.println("Argument: " + n);
        System.out.println("Value: " + F(n));
    }
}

class BaseA extends Base {
    BaseA() {
        super("factorial");
    }
    
    int F(int n) {
        if (n == 1) return 1;
        else return n * F(n - 1);
    }
}

class BaseB extends Base {
    BaseB() {
        super("double factorial");
    }
    
    int F(int n) {
        if (n == 1 || n == 2) return n;
        else return n * F(n - 2);
    }
}
/**
 *
 * @author web
 */
public class AbstractDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BaseA A = new BaseA();
        BaseB B = new BaseB();
        
        A.show(5);
        B.show(5);
    }
    
}
