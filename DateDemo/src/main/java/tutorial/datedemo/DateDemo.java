/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial.datedemo;
import java.util.*;
/**
 *
 * @author web
 */
public class DateDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date now = new Date();
        Date old = new Date(1000000000000L);
        System.out.println("Current date and time: " + now);
        System.out.println("One more date: " + old);
    }
    
}
