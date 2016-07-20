package com.javatutorial.generics;

//multiple type parameters。多个类参数
public interface Pair<K, V> {
    public K getKey();
    public V getValue();
}