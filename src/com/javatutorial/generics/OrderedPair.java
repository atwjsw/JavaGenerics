package com.javatutorial.generics;

//多参数泛型类
public class OrderedPair<K, V> implements Pair<K,V> {
	
	private K key;
	private V value;
	
	@Override
	public K getKey() {
		return this.key;
	}

	@Override
	public V getValue() {
		return this.value;
	}

	public OrderedPair(K key, V value) {
		this.key = key;
		this.value = value;
	}

}
