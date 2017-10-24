/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en03;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nao
 */
public class kadai02_2 {

    /**
     * @param args the command line arguments
     */
      public static void main(String[] args) {
          
          double weight = 0;
          double age = 0;
          int num = 0;
          double w;
          double a;
        // TODO code application logic here
        List<Cat> clist = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(new File("data2.csv")));

            String line;

            while ((line = br.readLine()) != null) {
                Cat cat = new Cat();
                String[] word = line.split(",");
                cat.setNo(Integer.parseInt(word[0]));
                cat.setName(word[1]);
                cat.setKind(word[2]);
                cat.setKenami(word[3]);
                cat.setColor(word[4]);
                cat.setSex(word[5]);
                cat.setAge(Integer.parseInt(word[6]));
                cat.setWeight(Double.parseDouble(word[7]));

                clist.add(cat);
                weight += Double.parseDouble(word[7]);
                age += Double.parseDouble(word[6]);
                num += 1;
                

            }
            br.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

          w = weight/num;
          a = age/num;
          
          System.out.printf("登録されているネコの平均体重は %.2fkg です。\n", w);
          System.out.printf("登録されているネコの平均年齢は %.2f才 です。\n", a);
        
    }
    
}
