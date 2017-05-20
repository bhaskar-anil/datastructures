package com.bhaskar.ds;

public class Stack<T> {
	
	Element<T> head;
	
	//pop - will pop an element in LIFO manner
	void pop(){
		if(head == null){
			System.out.println("Empty Stack.");
			return;
		}
		if(head.next == null){
			System.out.println(head.data +" popped1.");
			this.head = null;			
			return;
		}
		System.out.println(head.data +" popped.");
		this.head = head.next;
		return;
	}
	
	//push - will push on top of the stack
	void push(T data){
		if(head != null){
			Element<T> newHead = new Element<T>(data);
			newHead.next = head;
			this.head = newHead;
			return;
		}
		Element<T> newHead = new Element<T>(data);
		this.head = newHead;
		
	}
	
	public String toString(){
		StringBuilder s = new StringBuilder("---top---\n");
		
		while(head.next != null){
			s.append(head.data+"\n");
			head = head.next;
		}
		s.append(head.data+"\n");
		s.append("---bottom---");
		
		return s.toString();
	}
	
	
	public static void main(String[] args) {
		Stack<Integer> intStack = new Stack<>();
		
		
		intStack.push(1);
		intStack.push(2);
		intStack.push(3);
		intStack.push(4);
		intStack.push(5);
		
		
		intStack.pop();
		intStack.pop();
		
		System.out.println(intStack.toString());
		
		Stack<String> strStack = new Stack<>();
		
		strStack.push("Kamal");
		strStack.push("Ritika");
		strStack.push("Chusia");
		
		System.out.println(strStack.toString());
	}

}
