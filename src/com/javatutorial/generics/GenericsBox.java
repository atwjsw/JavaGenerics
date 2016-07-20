package com.javatutorial.generics;

/**
 * Generic version of the Box class.
 * @param <T> the type of the value being boxed
 * ����T����Ĳ����������װ��ֵ�����͡�Java1.5��ǰ����û�в����ĸ���ġ�
 *  A type variable can be any non-primitive type you specify
 */
public class GenericsBox<T> {
	
	// T stands for "Type"����ʱT��û�о��������
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}	
}
