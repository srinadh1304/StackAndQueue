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
	
	
	public Node dequeue() {
		return queueLinkedList.pop();
	}
	
	
	public boolean isEmpty() {
		if(queueLinkedList.head != null) {
			return false;
		}
		else {
			return true;
		}
	}
	
	
	public int size() {
		return queueLinkedList.size();
	}
	
	
	public void printQueue() {
		queueLinkedList.display();
	}
}