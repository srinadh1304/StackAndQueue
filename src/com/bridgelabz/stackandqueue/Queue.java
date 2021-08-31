package com.bridgelabz.stackandqueue;
import com.bridgelabz.linkedlist.*;

public class Queue<K> {
	
	private final MyLinkedList queueLinkedList;
	
	public Queue() {
		queueLinkedList = new MyLinkedList();
	}
	
	
	public void enqueue(Node element) {
		queueLinkedList.append(element);
	}
	
	
	public void printQueue() {
		queueLinkedList.display();
	}
}