/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial.makestring;

/**
 *
 * @author web
 */
public class MakeString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str1 = new String("Text literal");
        System.out.println(str1);
        
        String str2 = new String(str1);
        System.out.println(str2);
        
        String str3 = new String();
        System.out.println(str3);
        
        char[] symbs = new char[]{'A','r','r','a','y'};
        String str4 = new String(symbs);
        System.out.println(str4);
        
        byte[] nums = new byte[]{78, 97, 109, 98, 101, 114, 115};
        String str5 = new String(nums);
        System.out.println(str5);
    }
    
}
