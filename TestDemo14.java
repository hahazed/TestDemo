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
		   System.out.print("输入参数错误，请重新输入:");
		   System.out.println("格式为:java TestDemo14 源文件 目标文件");
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
			   System.out.println("复制成功");
		   }catch(Exception e) {
			   e.printStackTrace();
			   System.out.println("复制失败");
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
