package org.oyj.demo;

public class TestDemo07 {
    public static void main(String args[]) {
        char a[]= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t'};
        StringBuffer strb=new StringBuffer();
        for(int x=0;x<a.length;x++) {
        	strb.append(a[x]);
        }
        System.out.println("���ַ�������String����:"+strb);
        System.out.println("�ַ����ķ�ת:"+strb.reverse());
        System.out.println("ɾ��ǰ���Ԫ��:"+strb.delete(0, 4));
    }
}
