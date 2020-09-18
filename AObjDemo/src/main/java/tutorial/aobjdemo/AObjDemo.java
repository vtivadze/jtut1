/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial.aobjdemo;
import javax.swing.*;

class MyClass {
    int[] nums;
    
    MyClass(int n) {
        nums = new int[n];
        
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 1;
        }
    }
    
    void show() {
        String text = "Natula numbers:\n";
        
        for (int i = 0; i < nums.length; i++) {
            text += nums[i] + " ";
        }
        
        JOptionPane.showMessageDialog(null, text);
    }
}
/**
 *
 * @author web
 */
public class AObjDemo {

    static void show(MyClass obj) {
        String text = "Array elements:\n";
        int n = (int)Math.ceil(Math.sqrt(obj.nums.length));
        
        for (int i = 0; i < obj.nums.length - 1; i++) {
            text += obj.nums[i] + ( (i + 1) % n == 0 ? " >> next\n" : " : ");
        }
        text += obj.nums[obj.nums.length - 1] + ". The end";
        
        JOptionPane.showMessageDialog(null, text);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new MyClass(12).show();
        show(new MyClass(24));
    }
    
}
