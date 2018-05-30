package org.oyj.demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestDemo09 {
   public static void main(String args[]) {
	   String str="1992-10-09";
	   String pat="\\d{4}-\\d{2}-\\d{2}";
	   Pattern p=Pattern.compile(pat);
	   Matcher m=p.matcher(str);
	   if(m.matches()) {
		   System.out.println("字符串合法");
	   }else {
		   System.out.println("字符串不合法");
	   }
	   
	   String str1="A11B432BRDSTGB432BSD3VB4D3BD4FB6E3D2BF4F3R3".replaceAll("\\d","_");
	   boolean flag="1992-10-09".matches("\\d{4}-\\d{2}-\\d{2}");
	   String str2[]="ADSA1321DS43241S3D3D3J8JF83HD82JD82DJ28".split("\\d");
	   System.out.println("字符串的替换:"+str1+",字符串的验证:"+flag);
	   for(String s:str2) {
		   System.out.print(s);
	   }
   }
}
