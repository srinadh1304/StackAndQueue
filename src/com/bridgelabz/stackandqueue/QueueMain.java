package com.bridgelabz.stackandqueue;
import com.bridgelabz.linkedlist.Node;
public class QueueMain {
public static void main(String[] args) {
		
		Queue QueueList = new Queue();
		Node<Integer> firstNode = new Node<Integer>(56);
		Node<Integer> secondNode = new Node<Integer>(30);
		Node<Integer> thirdNode = new Node<Integer>(70);
		QueueList.enqueue(firstNode);
		QueueList.enqueue(secondNode);
		QueueList.enqueue(thirdNode);
		System.out.println("Queue: ");
		QueueList.printQueue();

	}
}
