package com.javatutorial.generics;

import java.util.ArrayList;
import java.util.List;

public class WildCard {

	public static <T> void testListT(List<T> lt) {
		System.out.println(lt);
	}
	
	public static void testListW(List<?> lw) {
		System.out.println(lw);		
	}
	
	//WildCard ��������
    public static <T> void printListO(List<T> list) {
        for (Object elem : list)
            System.out.println(elem + " ");
        System.out.println();
    }
    
    public static void printListL(List<?> list) {
        for (Object elem: list)
            System.out.print(elem + " ");
        System.out.println();
    }   
	
    	public static void main(String[] args) {
		
		//List<T>��������ΪList<Number>�����Ͻ����κ�Number������࣬����ԭʼ�����ɵİ����ࡣ
		List<Number> ln = new ArrayList<>();
		ln.add(1);
		ln.add(1.0);
		ln.add(1L);
		WildCard.printListO(ln);	
//		WildCard.printListL(ln);	
		
	}

}
