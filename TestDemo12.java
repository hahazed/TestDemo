package org.oyj.demo;

import java.util.Scanner;

public class TestDemo12 {
     public static void main(String args[]) {
    	 int a = 0,b = 0,c = 0;
    	 Scanner scan=new Scanner(System.in);
    	 System.out.println("请输入整数:");
    	 if(scan.hasNextInt()) {
    		  a=scan.nextInt();
    	 }
    	 System.out.println("请输入整数:");
    	 if(scan.hasNextInt()) {
    		  b=scan.nextInt();
    	 }
    	 System.out.println("请输入整数:");
    	 if(scan.hasNextInt()) {
    		  c=scan.nextInt();
    	 }
    	int max=a>b?a:b;
     	max=max>c?max:c;
     	int min=a<b?a:b;
     	min=min<c?min:c;
     	System.out.println("最大值是:"+max);
     	System.out.println("最小值是:"+min);
     }
}
