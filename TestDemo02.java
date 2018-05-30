package org.oyj.demo;
//½×³Ë  5!=1*2*3*4*5
public class TestDemo02 {
   public static void main(String args[]) {
	   int sum=0;	   
	   for(int i=1;i<=20;i++) {
		   int temp=1;
		   for(int j=1;j<=i;j++) {
			   temp*=j;
		   }
		   sum+=temp;
	   }
	   System.out.println(sum);
   }
}
