package org.oyj.demo;

import java.util.Scanner;

public class TestDemo13 {
    public static void main(String args[]) {
    	  Operate op=new Operate();
    	  op.check();
    }
}

class Operate{
	public void check() {
		Scanner scan=new Scanner(System.in);
		int count=0;
		int sum=0;
		boolean flag=true;
	    while(flag) {
	    	System.out.println("�������û���:");
	    	String str=scan.next();
	    	if(str==null) {
	    		System.out.println("�û�������Ϊ��!");
	    		flag=true;
	    	}else {
	    		if(str.equals("mldn")) {
	    			System.out.println("����������:");
	    			String str1=scan.next();
	    			if(str1==null) {
	    				System.out.println("���벻��Ϊ��!");
	    				flag=true;
	    			}else {
	    				if(str1.equals("hello")) {
	    					System.out.println("��¼�ɹ���");
	    					flag=false;
	    				}else {
	    					System.out.println("�������");
	    					count++;
	    					flag=true;
	    					if(count==3) {
	    						System.out.println("���������������δ���ϵͳ�˳�");
	    						System.exit(1);
	    					}
	    				}
	    			}
	    		}else {
	    			System.out.println("�����û�������");
	    			sum++;
	    			flag=true;
	    			if(sum==3) {
	    				System.out.println("��ϵ�����û������δ���,ϵͳ�˳�");
	    				System.exit(1);
	    			}
	    		}
	    	}
	    }
	}
}