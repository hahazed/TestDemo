package org.oyj.demo;

public class TestDemo07 {
    public static void main(String args[]) {
        char a[]= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t'};
        StringBuffer strb=new StringBuffer();
        for(int x=0;x<a.length;x++) {
        	strb.append(a[x]);
        }
        System.out.println("将字符数组变成String类型:"+strb);
        System.out.println("字符串的反转:"+strb.reverse());
        System.out.println("删除前五个元素:"+strb.delete(0, 4));
    }
}
