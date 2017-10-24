/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en00;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;



/**
 *
 * @author nao
 */
public class Q05 {
    public static void main(String[] args) {
       
        Date date = new Date();
        
        DateFormat dtf= new SimpleDateFormat("yyyy年MM月dd日(E) HH時mm分ss秒");

                String output = dtf.format(date);
                System.out.println(output);
//Calendar cal = Calendar.getInstance();
        //System.out.println(cal.get(Calendar.DATE));
    }
}
