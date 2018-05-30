package org.oyj.demo;
//水仙花数
public class TestDemo {
     public static void main(String args[]) {
    	 int a=0;
    	 int b=0;
    	 int c=0;
    	 int count=0;
    	 for(int i=100;i<1000;i++) {
    		 a=i/100;
    		 b=(i-a*100)/10;
    		 c=(i-a*100-b*10);
    		 if((a*a*a+b*b*b+c*c*c)==i) {
    			 System.out.print(i+",");
    			 count++;
    		 }
    	 }
    	 System.out.println("\n共有:"+count);
     }
}
