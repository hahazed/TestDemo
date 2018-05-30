package org.oyj.demo;

public class TestDemo06 {
    public static void main(String args[]) {
    	int oldArr[]= {2,3,5,0,7,0,5,9,4,0,23,0};
    	int newArr[]=new int[oldArr.length-4];
    	int foot=0;
    	for(int i=0;i<oldArr.length;i++) {    		
    		if(oldArr[i]!=0) {
    		newArr[foot]=oldArr[i];  
    		foot++;
    		}
    	}   
    	for(int j=0;j<newArr.length;j++) {
    		System.out.print(newArr[j]+",");
    	}
    }
}
