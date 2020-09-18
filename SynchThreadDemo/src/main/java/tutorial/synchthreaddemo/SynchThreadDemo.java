/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial.synchthreaddemo;
import java.util.*;

class MyClass {
    private int count;
    
    MyClass() {
        count = 0;
    }
    
    void set(int count, String name) {
        this.count = count;
        System.out.println(name + " There was set the value of the field " + count + ": " + new Date());
    }
    
    int get(String name) {
        System.out.println(name + " There was read the value of the field " + count + ": " + new Date());
        return count;
    }
}

class MyThread extends Thread {
    private boolean UpDown;
    private String name;
    private MyClass obj;
    
    public void run() {
        Random rnd = new Random();
        int number;
        for (int i = 1; i <= 3; i++) {
            synchronized(obj) {
                try {
                    number = obj.get(name);
                    if (UpDown) number++;
                    else number--;
                    sleep(1000 + rnd.nextInt(9000));
                    obj.set(number, name);
                } catch(InterruptedException e) {
                    System.out.println(e);
                }
            }
        }
    }
    
    MyThread(boolean UpDown, MyClass obj) {
        this.UpDown = UpDown;
        if (UpDown) name = "Up-thread. ";
        else name = "Down-thread. ";
        this.obj = obj;
        start();
    }
}
/**
 *
 * @author web
 */
public class SynchThreadDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        MyClass obj = new MyClass();
        
        MyThread thA = new MyThread(true, obj);
        MyThread thB = new MyThread(false, obj);
        
        thA.join();
        thB.join();
        
        System.out.println("At the end: ");
        obj.get("");
    }
    
}
