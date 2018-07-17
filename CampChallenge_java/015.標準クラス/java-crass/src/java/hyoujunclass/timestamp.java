/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hyoujunclass;
  import java.util.Date;
  import java.text.SimpleDateFormat;
  import java.util.Calendar;
/**
 *
 * @author guest1Day
 */
public class timestamp {
    
    public static void main(String[] args){
        
        //練習
        System.out.println("練習");
        Date d = new Date(0);
        
        System.out.println(d);
        
        SimpleDateFormat d1 = new SimpleDateFormat("yyyy/MM/dd");
        String c1 = d1.format(d);
        System.out.println(c1);
        System.out.println();
        

        
        //課題内容①
        Calendar kadai1 = Calendar.getInstance();
        kadai1.set(2016,0,1,0,0,0);        
        System.out.println("課題１");
        System.out.println(kadai1.getTime());
        System.out.println();    
        
        //課題内容②
        Date kadai2 = new Date();
        SimpleDateFormat k2f = new SimpleDateFormat("yyyy年MM月dd日　HH時mm分ss秒");
        System.out.println("課題２");
        String k2s = k2f.format(kadai2);
        System.out.println(k2s);


        //課題内容③
        Calendar kadai3 = Calendar.getInstance();
        kadai3.set(2016,10,4,10,0,0);
        SimpleDateFormat k3f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String k3s = k3f.format(kadai3.getTime());
        System.out.println(k3s);
    }

    
}
