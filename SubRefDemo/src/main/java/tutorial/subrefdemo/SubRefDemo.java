/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial.subrefdemo;

class Base {
    String name;
    
    Base(String name) {
        this.name = name;
    }
    
    void show() {
        System.out.println("Super class object: " + name);
    }
    
    void sayHello() {
        System.out.println("Hello everybody!");
    }
}

class SubBase extends Base {
    char code;
    
    SubBase(String name, char code) {
        super(name);
        this.code = code;
    }
    
    void show() {
        System.out.println("Sub class object: " + name + ". Kod: " + code);
    }
}
/**
 *
 * @author web
 */
public class SubRefDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Base obj;
        
        obj = new Base("Base");
        obj.sayHello();
        obj.show();
        
        obj = new SubBase("Derivable", 'A');
        obj.sayHello();
        obj.show();
    }
    
}
