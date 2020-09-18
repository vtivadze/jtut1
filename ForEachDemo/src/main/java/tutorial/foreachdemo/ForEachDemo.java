/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial.foreachdemo;
import javax.swing.*;
/**
 *
 * @author web
 */
public class ForEachDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 4, 7, 3, 1, 8, 9, 2};
        
        for (int s:a) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
    
}
