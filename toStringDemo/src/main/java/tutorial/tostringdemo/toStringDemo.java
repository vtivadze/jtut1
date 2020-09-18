/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial.tostringdemo;

class MyClass {
    char[] code;
    int count;
    String name;
    
    MyClass(char[] code, int count, String name) {
        int i;
        
        this.code = new char[code.length];
        for (i = 0; i < code.length; i++) {
            this.code[i] = code[i];
        }
        this.count = count;
        this.name = new String(name);
    }
    
    public String toString() {
        String text = "Object field values.\n";
        text += "Field name: " + name + "\n";
        text += "Field count: " + count + "\n";
        text += "Field code: |";
        for (int i=0; i<code.length; i++) {
            text += " " + code[i] + " |";
        }
        return text;
    }
}
/**
 *
 * @author web
 */
public class toStringDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyClass obj = new MyClass(new char[]{'Z', 'A', 'R', 'Q', 'W'}, 100, "NEW");
        System.out.println(obj);
    }
    
}
