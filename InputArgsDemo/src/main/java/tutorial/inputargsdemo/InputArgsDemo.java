/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial.inputargsdemo;
import javax.swing.*;

class Fellow {
    String name;
    String surname;
    int age;
    double weight;
    
    Fellow(String name, String surname, int age, double weight) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.weight = weight;
        show();
    }
    
    void show() {
        String  str = "Name: " + name + "\n";
        str += "Surname: " + surname + "\n";
        str += "Age: " + age + "\n";
        str += "Weight: " + weight + " Kg";
        JOptionPane.showMessageDialog(null, str);
    }
}
/**
 *
 * @author web
 */
public class InputArgsDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name = args[0];
        String surname = args[1];
        int age = Integer.parseInt(args[2]);
        double weight = Double.parseDouble(args[3]);
        
        new Fellow(name, surname, age, weight);
    }
    
}
