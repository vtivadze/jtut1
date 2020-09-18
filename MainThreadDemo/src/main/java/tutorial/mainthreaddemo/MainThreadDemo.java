/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial.mainthreaddemo;

/**
 *
 * @author web
 */
public class MainThreadDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        Thread t;
        long time = 2500;
        
        t = Thread.currentThread();
        System.out.println(t);
        
        t.setName("This is the most main thread!");
        int p = t.getPriority();
        t.setPriority(++p);
        System.out.println(t);
        
        System.out.println("The thread execution was interrupted for " + (double)time / 1000 + " seconds.");
        Thread.sleep(time);
        
        System.out.println("The program is ended!");
    }
    
}
