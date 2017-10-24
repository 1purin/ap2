/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kougi01;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author nao
 */
public class EX11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File f1 = new File("text.txt");
        System.out.println("ファイル名：" + f1.getName());
        System.out.println("絶対パス：" + f1.getAbsolutePath());
        System.out.println("サイズ：" + f1.length() + "バイト");

        
        
    }
    
}
