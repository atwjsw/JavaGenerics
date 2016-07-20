package com.javatutorial.generics;

import java.util.List;

import org.junit.Test;

/**
 * Bounded Type����ʾ
 * @author ewendia
 *
 * @param <T>
 */
public class BoundedParamBox<T> {
	
		private T t;

		public T getT() {
			return t;
		}

		public void setT(T t) {
			this.t = t;
		}	
		
		//������ֻ����Number��������
		public <U extends Number> void inspect(U u){
	        System.out.println("T: " + t.getClass().getName());
	        System.out.println("U: " + u.getClass().getName());
	    }		
		

	    public static void main(String[] args) {
	    	BoundedParamBox<Integer> integerBox = new BoundedParamBox<Integer>();
	        integerBox.setT(new Integer(10));
	        //integerBox.inspect("some text"); // error: this is still String!
	        integerBox.inspect(new Double(10)); //Double��Number������
	    }	    

}
