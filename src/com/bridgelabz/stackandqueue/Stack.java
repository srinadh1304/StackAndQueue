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
	
	
	public Node peek() {
		return stackLinkedList.head;
	}
	
	
	public Node pop() {
		return stackLinkedList.pop();
	}
	
	
	public boolean isEmpty() {
		if(stackLinkedList.head != null) {
			return false;
		}
		else {
			return true;
		}
	}
	
	
	public int size() {
		return stackLinkedList.size();
	}
	
	
	public void printStack() {
		stackLinkedList.display();
	}
}