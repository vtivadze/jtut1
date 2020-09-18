/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial.makeobjectcopydemo;

class MakeObjCopy {
    String name;
    int number;
    
    MakeObjCopy(String str, int num) {
        name = str;
        number = num;
    }
    
    MakeObjCopy(MakeObjCopy obj) {
        name = obj.name;
        number = obj.number;
    }
    
    MakeObjCopy copy() {
        MakeObjCopy tmp = new MakeObjCopy(name, number);
        return tmp;
    }
    
    void show() {
        String text = "Object fields:\n";
        text += "name: " + name + "\n" + "number: " + number;
        System.out.println(text);
    }
}
/**
 *
 * @author web
 */
public class MakeObjectCopyDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MakeObjCopy objA = new MakeObjCopy("The first object", 100);
        MakeObjCopy objB = new MakeObjCopy(objA);
        
        objA.show();
        objB.show();
        
        objB.name = "The second object";
        objB.number = 200;
        
        objA.show();
        objB.show();
        
        objA = objB.copy();
        objA.show();
        
        objB.name = "The second object was changed!";
        objB.number = 300;
        
        objA.show();
        objB.show();
    }
    
}
