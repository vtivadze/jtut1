/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial.fileinoutdemo;
import java.io.*;
/**
 *
 * @author DELL
 */
public class FileInOutDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        try {
            String baseFilePath = "D:\\Java\\Projects\\Examples\\FileInOutDemo\\tmp\\base.txt";
            String dataFilePath = "D:\\Java\\Projects\\Examples\\FileInOutDemo\\tmp\\data.txt";
            
            FileInputStream fis = new FileInputStream(baseFilePath);
            FileOutputStream fos = new FileOutputStream(dataFilePath, true);
            
            BufferedReader br = new BufferedReader(new InputStreamReader(fis, "UTF-8"));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
            
            String str;
            do {
                str = br.readLine();
                System.out.println(str);
                bw.newLine();
                bw.write(str.toLowerCase().replace(' ', '_'));
            } while (!str.equalsIgnoreCase("Омар Хайям"));
            
            br.close();
            bw.close();
        } catch (FileNotFoundException e) {
            System.out.println("The file was not found! " + e);
        }
    }
    
}
