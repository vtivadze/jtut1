/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial.stringtokenizerdemo;
import java.util.*;
/**
 *
 * @author web
 */
public class StringTokenizerDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String text = "A very simple text: contains by words, and no numbers!";
        StringTokenizer str = new StringTokenizer(text);
        
        String s;
        while (str.hasMoreTokens()) {
//            s = str.nextToken();
//            s = str.nextToken(" :,!");
            s = str.nextToken(":,!");
            
            System.out.println(s);
        }
    }
    
}
