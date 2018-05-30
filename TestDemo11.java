package org.oyj.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class TestDemo11 {
    public static void main(String args[]) {
    	InpuData inpu=new InpuData();
    	int a=inpu.getInt("����������:", "�������");
    	int b=inpu.getInt("����������:", "�������");
    	int c=inpu.getInt("����������:", "�������");
    	int max=a>b?a:b;
    	max=max>c?max:c;
    	int min=a<b?a:b;
    	min=min<c?min:c;
    	System.out.println("���ֵ��:"+max);
    	System.out.println("��Сֵ��:"+min);
    }     
} 
 



class InpuData{
	 private BufferedReader buf=null;
	 public InpuData() {
		this.buf=new BufferedReader(new InputStreamReader(System.in)); 
	 }
	 public int getInt(String info,String err) {
		 String str=null;
		 boolean flag=true;
		 int temp=0;
		 while(flag) {
			 System.out.println(info);
			 try {
				str=this.buf.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(str.matches("^\\d+$")) {
				temp=Integer.parseInt(str);
				flag=false;
			}else {
				System.out.println(err);
			}
		 }
		 return temp;
	 }		 	 
}