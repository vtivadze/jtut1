/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial.usinginterfacedemo;

interface Mathematica {
    int TEN = 10;
    
    int factorial(int n);
    double power(double x, int n);
}

class MyMath implements Mathematica {
    public int factorial(int n) {
        int s = 1, i;
        for (i = n; i > 0; s *= i--);
        return s;
    }
    
    public double power(double x, int n) {
        double s = 1;
        for (int i = 1; i <= n; s *= x, i++);
        return s;
    }
    
    void show(double x, int n) {
        System.out.println("The first argument: " + x);
        System.out.println("The second argument: " + n);
        System.out.println("Factorial: " + factorial(n));
        System.out.println("Power: " + power(x, TEN));
    }
}
/**
 *
 * @author web
 */
public class UsingInterfaceDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyMath obj = new MyMath();
        
        int n = Mathematica.TEN / 3;
        double x = (double)MyMath.TEN / n - n;
        
        obj.show(x, n);
    }
    
}
