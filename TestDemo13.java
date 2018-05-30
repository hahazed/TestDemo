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
	    	System.out.println("请输入用户名:");
	    	String str=scan.next();
	    	if(str==null) {
	    		System.out.println("用户名不能为空!");
	    		flag=true;
	    	}else {
	    		if(str.equals("mldn")) {
	    			System.out.println("请输入密码:");
	    			String str1=scan.next();
	    			if(str1==null) {
	    				System.out.println("密码不能为空!");
	    				flag=true;
	    			}else {
	    				if(str1.equals("hello")) {
	    					System.out.println("登录成功！");
	    					flag=false;
	    				}else {
	    					System.out.println("密码错误！");
	    					count++;
	    					flag=true;
	    					if(count==3) {
	    						System.out.println("连续输入密码三次错误！系统退出");
	    						System.exit(1);
	    					}
	    				}
	    			}
	    		}else {
	    			System.out.println("输入用户名错误");
	    			sum++;
	    			flag=true;
	    			if(sum==3) {
	    				System.out.println("联系输入用户名三次错误,系统退出");
	    				System.exit(1);
	    			}
	    		}
	    	}
	    }
	}
}