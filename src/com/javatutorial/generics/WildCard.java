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
	
	//WildCard 方法测试
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
		
		//List<T>可以声明为List<Number>，集合接受任何Number类和子类，包括原始类生成的包裹类。
		List<Number> ln = new ArrayList<>();
		ln.add(1);
		ln.add(1.0);
		ln.add(1L);
		WildCard.printListO(ln);	
//		WildCard.printListL(ln);	
		
	}

}
