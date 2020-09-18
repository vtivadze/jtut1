/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial.privatedemo;

class Base {
    private String name;
    private int number;
    
    Base(String name, int number) {
        this.name = name;
        this.number = number;
    }
    
    private void show() {
        System.out.println("Object with a name: " + name);
    }
    
    void showAll() {
        show();
        System.out.println("The number field of the object equals to " + number);
    }
    
    void setAll(String name, int number) {
        this.name = name;
        this.number = number;
    }
}

class SubBase extends Base {
    SubBase(String str, int num) {
        super(str, num);
        showAll();
    }
}
/**
 *
 * @author web
 */
public class PrivateDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SubBase obj = new SubBase("NEW", 1);
        obj.setAll("THE SAME", 2);
        obj.showAll();
    }
    
}
