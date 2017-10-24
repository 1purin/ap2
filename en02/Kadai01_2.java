/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author nao
 */
public class Kadai01_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            File inFile = new File("out11.txt");
            FileReader fr = new FileReader(inFile);
            BufferedReader br = new BufferedReader(fr);
            String line;
            File outFile = new File("out12.txt");
            FileWriter fw = new FileWriter(outFile);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            int a = 0;
            double sum = 0.0;
            int num = 0;
            pw.print("名前リスト:");

            while ((line = br.readLine()) != null) {
                a++;
                if (a % 2 == 1) {
                    pw.print(line + "/");
                } else {
                    num++;
                    sum += Double.parseDouble(line);

                }

            }

            pw.println("");
            pw.print("平均点:");
            pw.print(sum / num);

            br.close();
            pw.close();

        } catch (IOException e) {
            System.out.println("失敗");
        }
    }
}
