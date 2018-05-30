package org.oyj.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestDemo15 {
     public static void main(String args[]) {    	 
    	 List<Student> allList=new ArrayList<Student>();
    	 allList.add(new Student(1,"王5",10.0f));
    	 allList.add(new Student(2,"王6",70.0f));
    	 allList.add(new Student(3,"王7",30.0f));
    	 allList.add(new Student(4,"王8",60.0f));
    	 allList.add(new Student(5,"王9",20.0f));    	
    	 Iterator<Student> iter=allList.iterator();
    	 while(iter.hasNext()) {
    		 System.out.println(iter.next());
    	 }
    	 Collections.sort(allList);
    	 for(int x=0;x<allList.size();x++) {
    		 System.out.println("--------------------"+allList.get(x));
    	 }
     }
}

class Student implements Comparable<Student>{
	 private int id;
	 private String name;
	 private float score;
	 public Student(int id,String name,float score) {
		 this.setId(id);
		 this.setName(name);
		 this.setScore(score);
	 }
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getScore() {
		return score;
	}
	public void setScore(float score) {
		this.score = score;
	}
	 public int compareTo(Student stu) {
		 if(this.score>stu.score) {
			 return -1;
		 }else if(this.score<stu.score) {
			 return 1;
		 }else {
			 return 0;
		 }
	 }
	 public String toString() {
		 return "姓名:"+this.name+"，得分:"+this.score;
	 }
}