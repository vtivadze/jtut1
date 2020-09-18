/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial.scannerdemo;

import java.util.*;

/**
 *
 * @author DELL
 */
public class ScannerDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        int age;
        double weight;
        
        System.out.print("What is your name? ");
        name = input.nextLine();
        System.out.println("Good morning " + name + "!");
        
        System.out.print("How old ar you? ");
        age = input.nextInt();
        System.out.println("You are " + age + " years old!");
        
        System.out.print("Specify your weight (kg):");
        weight = input.nextDouble();
        System.out.println("Your weight is " + weight + " kg!");
    }
    
}
