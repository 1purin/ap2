/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kougi01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author nao
 */
public class EX12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try{
            BufferedReader br = new BufferedReader(
                new FileReader(new File("text.txt")));
            PrintWriter pw = new PrintWriter(
                new BufferedWriter(new FileWriter(new File("out.txt"))) );
            
            String line;
            String str = "";
            while((line = br.readLine()) ! = null){
            str += line + "\n";
        }
            pw.print(str);
        
            br.close();
            pw.close();
            
            catch{
                    
                    }
            
            
        }
        
    }
    
}
