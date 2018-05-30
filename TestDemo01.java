package org.oyj.demo;
//13-23+33....
public class TestDemo01 {
   public static void main(String args[]) {
	   int i=13;
	   int j=23;
	   int sum=0;
	   do {
		   sum+=(i-j);
		   i+=20;
		   j+=20;
	   }while(i<=993);
	   System.out.println(sum);
   }
}
