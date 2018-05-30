package org.oyj.demo;

import java.util.Random;

public class TestDemo08 {
    public static void main(String args[]) {
    	int arr[]=new int[5];
    	for(int x=0;x<arr.length;x++) {
    		arr[x]=(int)(Math.random()*29+1);  //Math.random()---随机产生一个大于或者等于0小于1的数
    	}
    	for(int x:arr) {
    		System.out.print(x+",");
    	}
    	
    	Random rand=new Random();
    	for(int x=0;x<5;x++) {
    		System.out.print("第二段代码:"+rand.nextInt(30)+",");
    	}
    }
}
