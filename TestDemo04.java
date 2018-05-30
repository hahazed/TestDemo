package org.oyj.demo;
//阶乘用方法完成
public class TestDemo04 {
  public static void main(String args[]) {
	  	  System.out.println(sum(30));
  }
  public static double sum(int num) {
	  if(num==1) {
		  return mum(1);
	  }
	  return mum(num)+sum(num-1);
  }
  public static double mum(int num) {
	   if(num==1) {
		   return 1;
	   }
	   return num*mum(num-1);
  }
}
