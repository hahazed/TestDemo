package org.oyj.demo;

import java.util.Locale;
import java.util.ResourceBundle;

public class TestDemo10 {
   public static void main(String args[]) {
	   String str=args[0];
	   Locale loca=new Locale("zh","CN");
	   Locale loca1=new Locale("en","US");
	   ResourceBundle rb=ResourceBundle.getBundle("pro",loca);
	   ResourceBundle rb1=ResourceBundle.getBundle("pro1",loca1);
	   if(str.equals("1")) {
		   System.out.println(rb.getString("info"));
	   }else if(str.equals("2")) {
		   System.out.println(rb1.getString("info"));   
	   }		   	   
   }
}
