package com.javatutorial.generics;

import java.util.List;

/**
 * @author ewendia
 * 泛型方法演示
 */
public class Util {
	
	//The syntax for a generic method includes a type parameter, inside angle brackets, 
	//and appears before the method's return type.
    public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
        return p1.getKey().equals(p2.getKey()) &&
               p1.getValue().equals(p2.getValue());
    }
    
    public static double sumOfList(List<? extends Number> list) {
	    double s = 0.0;
	    for (Number n : list)
	        s += n.doubleValue();
	    return s;
	}
    
    public <U extends Number> void inspect(U u){
//      System.out.println("T: " + t.getClass().getName());
        System.out.println("U: " + u.getClass().getName());
    }		   
    
    //WildCard 方法测试
    public static void printListO(List<Object> list) {
        for (Object elem : list)
            System.out.println(elem + " ");
        System.out.println();
    }
    
    public static void printListL(List<?> list) {
        for (Object elem: list)
            System.out.print(elem + " ");
        System.out.println();
    }   
    
}
