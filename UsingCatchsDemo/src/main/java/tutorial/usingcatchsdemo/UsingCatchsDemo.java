/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial.usingcatchsdemo;
import java.util.*;
/**
 *
 * @author web
 */
public class UsingCatchsDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] array = new int[]{0, 1, 2, 3, 4, 5, 0, 8, 10, 12, 15};
        int n = 120, count = 0;
        
        while (count < 5) {
            try {
                System.out.print(n / array[rnd.nextInt(array.length + 2) - 1] + " ");
            } catch (ArithmeticException eObj) {
                System.out.println("\nError: dividing on zero! Description: " + eObj);
                count++;
            } catch (ArrayIndexOutOfBoundsException eObj) {
                System.out.println("\nError: invalid index! Description: " + eObj);
                count++;
            }
        }
    }
    
}
