package org.oyj.demo;

import java.util.LinkedList;

public class TestDemo16 {
    public static void main(String args[]) {
    	LinkedList<String> link=new LinkedList<String>();
    	link.add("A");
    	link.add("B");
    	link.add("C");	
    	link.add("D");	
    	link.add("E");	
    	link.add("F");
    	System.out.println(link);
    	System.out.println("找到表头:"+link.peek());
    	System.out.println(link);
    	System.out.println("找到表头并删除:"+link.poll());
    	System.out.println(link);
    	System.out.println("找到表头:"+link.element());
    	System.out.println(link);
    	System.out.println("以FIFO的方式输出:");
    	for(int x=0;x<link.size();x++) {
    		System.out.println(link.poll());
    	}
    }
}
