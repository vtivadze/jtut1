/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial.usingthrowdemo;

class MyException extends Exception {
    static int count = 0;
    String name;
    
    MyException(String name) {
        count++;
        this.name = name;
    }
    
    public String toString() {
        String text = "It was happend an error!\n";
        text += "Description: " + name + "\n";
        text += "Error number: " + count;
        return text;
    }
}

class MyClass {
    private int number;
    
    void show() {
        System.out.println("Field value: " + number);
    }
    
    MyClass(int number) {
        try {
            if (number > 10) {
                number = 10;
                throw new MyException("Too big number!");
            }
            
            if (number < 0) {
                number = 0;
                throw new MyException("Negative number!");
            }
        } catch (MyException obj) {
            System.out.println(obj);
        }
        
        this.number = number;
        show();
    }
    
    void set(int number) throws MyException {
        if (number > 10 || number < 0) throw new MyException("Invalid argument!");
        this.number = number;
        System.out.println("Everyting is OK!");
        show();
    }
}

/**
 *
 * @author web
 */
public class UsingThrowDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyClass objA = new MyClass(15);
        MyClass objB = new MyClass(-1);
        
        try {
            objA.set(100);
        } catch(MyException e) {
            System.out.println(e);
            objA.show();
        }
        
        MyException objE = new MyException("Not existing error!");
        try {
            throw objE;
        } catch(MyException e) {
            System.out.println(e);
        }
    }
    
}
