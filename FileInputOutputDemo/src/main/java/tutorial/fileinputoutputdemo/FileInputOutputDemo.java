/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial.fileinputoutputdemo;
import java.io.*;
import javax.swing.*;
/**
 *
 * @author DELL
 */
public class FileInputOutputDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        String DirPath = "D:\\Java\\Projects\\Examples\\FileInputOutputDemo\\tmp\\";
        String SourceFilePath = DirPath + JOptionPane.showInputDialog("Specify file name");
        String OutputFilePath = DirPath + "result.txt";
        
        System.out.println("The file to get input from: " + SourceFilePath);
        System.out.println("The file to put output in: " + OutputFilePath);
        
        try {
            FileInputStream fin = new FileInputStream(SourceFilePath);
            FileOutputStream fout = new FileOutputStream(OutputFilePath, true);

            int s = fin.read();
            while (s != -1) {
                switch (s) {
                    case 'T':
                        s = 't';
                        break;
                    case '.':
                        fout.write('<');
                        fout.write('*');
                        s = '>';
                        break;
                }
                fout.write(s);
                s = fin.read();
            }
            JOptionPane.showMessageDialog(null, "File was edited!", " The program was finised", JOptionPane.INFORMATION_MESSAGE);
            fin.close();
            fout.close();
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "There is no such a file there!", "Tere was happend an error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
