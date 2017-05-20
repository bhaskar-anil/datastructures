package com.bhaskar.ds;

public class Element<T> {
	
	T data;
	Element<T> next;
	
	public Element(T data){
		this.data = data;
		this.next = null;
	}

}
