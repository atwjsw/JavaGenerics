package com.javatutorial.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ewendia
 * 泛型功能演示
 */
public class GenericsDemo {
	
	//Compiler gives warnings. List and ArrayList are raw types.
	public void noGenerics() {
		List list = new ArrayList();
		list.add("hello");
		list.add("world");
		String s1 = (String) list.get(0); //cast needed.
		String s2 = (String) list.get(1);
		System.out.println(s1 + " " + s2);		
	}
	
	//no warning. no cast needed
	public void generics() {
		List<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("world");
		String s1 = (String) list.get(0);
		String s2 = (String) list.get(1);
		System.out.println(s1 + " " + s2);		// no cast
	}
	
}
