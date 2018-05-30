package org.oyj.demo;

public class TestDemo05 {
    public static void main(String args[]) {
    	int a=210;
    	if(a%3==0&&a%5==0&&a%7==0) {
    		System.out.println("可以被3.5.7整除");
    	}else {
    		System.out.println("不能同时被3.5.7整除");
    	}
    }
}
