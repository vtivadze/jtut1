/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial.moreargsdemo;

class MyClass {
    String name;
    
    MyClass(String name) {
        this.name = name;
    }
    
    void show() {
        System.out.println("Object with a name \"" + name + "\".");
    }
}
/**
 *
 * @author web
 */
public class MoreArgsDemo {
    
    static void ChangeRef(MyClass obj) {
        MyClass tmp = new MyClass("Local object");
        obj = tmp;
        obj.show();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyClass obj = new MyClass("Main object");
        obj.show();
        
        ChangeRef(obj);
        obj.show();
    }
    
}
