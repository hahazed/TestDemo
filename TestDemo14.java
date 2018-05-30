package org.oyj.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class TestDemo14 {
   public static void main(String args[]) {
	   if(args.length!=2) {
		   System.out.print("���������������������:");
		   System.out.println("��ʽΪ:java TestDemo14 Դ�ļ� Ŀ���ļ�");
		   System.exit(1);
	   }
	   File f=new File(args[0]);
	   File f1=new File(args[1]);
	   OutputStream out=null;
	   InputStream ins=null;
	   try {
		   out=new FileOutputStream(f1);
	   }catch(FileNotFoundException e){
		   e.printStackTrace();
	   }
	   try {
		   ins=new FileInputStream(f);
	   }catch(Exception e) {
		   e.printStackTrace();
	   }
	   if(out!=null&&ins!=null) {
		   int temp=0;
		   try {
			   while((temp=ins.read())!=-1) {
				      out.write(temp);
			   }
			   System.out.println("���Ƴɹ�");
		   }catch(Exception e) {
			   e.printStackTrace();
			   System.out.println("����ʧ��");
		   }
		   try {
			   out.close();
			   ins.close();
		   }catch(Exception e) {
			   e.printStackTrace();
		   }
	   }
   }
}
