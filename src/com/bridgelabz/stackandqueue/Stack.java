package com.bridgelabz.stackandqueue;

import com.bridgelabz.linkedlist.*;

public class Stack<K> {
	
	private final MyLinkedList stackLinkedList;
	
	public Stack() {
		stackLinkedList = new MyLinkedList();
	}
	
	
	public void push(Node element) {
		stackLinkedList.add(element);
	}

	
	public void printStack() {
		stackLinkedList.display();
	}
}