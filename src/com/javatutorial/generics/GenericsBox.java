package com.javatutorial.generics;

/**
 * Generic version of the Box class.
 * @param <T> the type of the value being boxed
 * 参数T是类的参数，代表包装的值的类型。Java1.5以前类是没有参数的概念的。
 *  A type variable can be any non-primitive type you specify
 */
public class GenericsBox<T> {
	
	// T stands for "Type"，此时T并没有具体的类型
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}	
}
