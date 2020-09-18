/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial.asignobjdemo;
import javax.swing.*;

class AssignObj {
    String text;
    
    AssignObj() {
        text = "A new object!";
    }
    
    AssignObj(String str) {
        text = str;
    }
    
    void show() {
        JOptionPane.showMessageDialog(null, text);
    }
}
/**
 *
 * @author web
 */
public class AsignObjDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AssignObj objA = new AssignObj();
        AssignObj objB = new AssignObj("The second object!");
        
        objA.show();
        objB.show();
        
        objA = objB;
        
        objA.show();
        objB.text = "It was changed the second object!";
        objA.show();
    }
    
}
