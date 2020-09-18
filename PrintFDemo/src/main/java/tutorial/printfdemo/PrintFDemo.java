/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial.printfdemo;

import java.util.*;
/**
 *
 * @author DELL
 */
public class PrintFDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String text = "Text string";
        double x = 100.0 / 7.0;
        double z = 130;
        int n = -1234567;
        int k = 7654321;
        int m = 0xABC;
        int l = 0123;
        Date now = new Date();
        
        System.out.printf("%s\t%d\t%f\n", text, k, z);
        System.out.printf("Decimal numbers:\n%1$g\t%2$e\t%1$07.2f\n", x, z);
        System.out.printf("Negativ numbers: %,(d\n", n);
        System.out.printf("Positive numbers: %+,d\n", k);
        System.out.printf("16 dgit number %x corresponds to 10 digit number %<d\n", m);
        System.out.printf("10 digit number %d corresponds to 16 digit number %<X\n", k);
        System.out.printf("8 digit number %o corresponds to 10 digit number %<d\n", l);
        System.out.printf("Month: %tB\n", now);
        System.out.printf("Date: %te\n", now);
        System.out.printf("Week day: %tA\n", now);
        System.out.printf("Time: %tT\n", now);
    }
    
}
