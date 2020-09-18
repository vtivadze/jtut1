/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial.trycatchdemo;
import java.util.*;
/**
 *
 * @author web
 */
public class TryCatchDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 3;
        int count = 0, nums = 0;
        int a, b;
        Random rnd = new Random();
        
        while (count < n) {
            nums++;
            
            try {
                a = rnd.nextInt(10);
                b = rnd.nextInt(6);
                
                System.out.print(nums + ") Result of dividing on integer: " + a + "/" + b + " = ");
                System.out.println(a / b);
            } catch (ArithmeticException eObj) {
                System.out.println("Infinity");
                System.out.println("Attention! It was happend an error: " + eObj);
                count++;
            }
        }
        System.out.println("Errors' count: " + n + ". Program is ended!");
    }
    
}
