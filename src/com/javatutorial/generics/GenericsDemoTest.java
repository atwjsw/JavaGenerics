package com.javatutorial.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class GenericsDemoTest {
	
	private GenericsDemo genericsDemo = new GenericsDemo();
	
	GenericsBox genericsBox = new GenericsBox();

	@Test
	public void testNoGenerics() {
		genericsDemo.noGenerics();
	}

	@Test
	public void testGenerics() {
		genericsDemo.generics();
	}
	
	@Test
	public void testGenericsBox() {
		
		//Instantiate a genericsBox with a "generic type invocation", 将T替换成具体类型
		GenericsBox<Integer> genericsBox1 = new GenericsBox<Integer>();
		GenericsBox<String> genericsBox2 = new GenericsBox<String>();		
		
		//原始类即未提供类型参数值的泛型。 A raw type is the name of a generic class or interface without any type arguments.
		//编译器告警：GenericsBox is a raw type. References to generic type GenericsBox<T> should be parameterized
		GenericsBox rawBox = new GenericsBox();
		
		//Type safety: The method setT(Object) belongs to the raw type GenericsBox. 
		//References to generic type GenericsBox<T> should be parameterized
		rawBox.setT(8);
		
		//Java1.7以后这样也可以
		//GenericsBox<Integer> genericsBox = new GenericsBox<>();
		
	}
	
	@Test
	//多参数泛型测试
	public void testOrderedPair() {
		OrderedPair<String, Integer> p1 = new OrderedPair<String, Integer>("age", 10); 
		OrderedPair<String, String> p2 = new OrderedPair<>("name", "Generics"); 
		System.out.println(p1.getKey() + " " +p1.getValue());
		System.out.println(p2.getKey() + " " +p2.getValue());
	}
	
	@Test
	//泛型方法测试
	public void testPair() {
		
		Pair<Integer, String> p1 = new OrderedPair<>(1, "apple");
		Pair<Integer, String> p2 = new OrderedPair<>(2, "pear");
		//The type has been explicitly provided, as shown in <Integer, String>
		boolean same1 = Util.<Integer, String>compare(p1, p2);	
		System.out.println(same1);
				
		Pair<Integer, String> p3 = new OrderedPair<>(1, "apple");
		Pair<Integer, String> p4 = new OrderedPair<>(1, "apple");
		//Generally, this can be left out and the compiler will infer the type that is needed
		boolean same2 = Util.compare(p3, p4);
		System.out.println(same2);
	}
	
	@Test
	//Wildcard测试
	public void testWildcard() {
		List<Integer> list = Arrays.asList(1,2,3);		
		System.out.println("sum = " + Util.sumOfList(list));
		
		List<Double> ld = Arrays.asList(1.2, 2.3, 3.5);
		System.out.println("sum = " + Util.sumOfList(ld));
		
		List<Integer> li = Arrays.asList(1, 2, 3);
		List<String>  ls = Arrays.asList("one", "two", "three");
		//OK. 因为 List(Integer）、 List(String）是List<?>的子类
		Util.printListL(li);
		Util.printListL(ls);
		//public static void printListO(List<Object> list)。因为 List(Integer）、 List(String）不是List<Object）的子类
		//Util.printListO(li); 编译器报错
		//Util.printListO(ls); 编译器报错
		
	}
}
