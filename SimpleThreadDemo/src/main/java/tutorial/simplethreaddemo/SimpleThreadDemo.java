/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial.simplethreaddemo;
import java.util.*;

class MyThread implements Runnable {
    public void run() {
        System.out.println("Child thread started: " + new Date());
        Random rnd = new Random();
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000 + rnd.nextInt(4000));
                System.out.println("Child thread: " + new Date());
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("Child thread was ended: " + new Date());
    }
    
    MyThread() {
        new Thread(this).start();
    }
}
/**
 *
 * @author web
 */
public class SimpleThreadDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread started: " + new Date());
        Random rnd = new Random();
        new MyThread();
        for (int i = 1; i < 5; i++) {
            Thread.sleep(5000 + rnd.nextInt(5000));
            System.out.println("Main thread: " + new Date());
        }
        System.out.println("Main thread was ended: " + new Date());
    }
    
}
