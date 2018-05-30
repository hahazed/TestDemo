package org.oyj.demo;
//¥Ú”°Õº–Œ
public class TestDemo03 {
    public static void main(String args[]) {
    	int length=10;
    	for(int i=1;i<=length;i++) {
    		for(int j=1;j<=length-i;j++) {
    			System.out.print(" ");
    		}
    		for(int j=1;j<=i;j++) {
    			System.out.print("* ");
    		}
    		System.out.println();
    	}
    }
}
