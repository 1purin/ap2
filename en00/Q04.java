/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en00;

import java.util.List;
import java.util.ArrayList;



/**
 *
 * @author nao
 */
public class Q04 {
    public static void main(String[] args) {
     List<String> alist = new ArrayList<>();
     alist.add("Apple");
     alist.add("Orange");
     alist.remove(1);
     alist.add("Banana");
        for (String abcd : alist) {
            System.out.println(abcd);
            
        }
    }
 
}
