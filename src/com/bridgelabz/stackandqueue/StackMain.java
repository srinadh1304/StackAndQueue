package com.bridgelabz.stackandqueue;
import com.bridgelabz.linkedlist.*;

public class StackMain {
	public static void main(String args[]) {
		System.out.println("****** Welcome to Stack and Queue Program *****");
		Stack<Integer> stackList = new Stack<Integer>();
		Node<Integer> firstNode = new Node<Integer>(70);
		Node<Integer> secondNode = new Node<Integer>(30);
		Node<Integer> thirdNode = new Node<Integer>(56);
		stackList.push(firstNode);
		stackList.push(secondNode);
		stackList.push(thirdNode);
		stackList.printStack();
		System.out.println("Top element of stack: "+stackList.peek().getKey());
		System.out.println("Size of the stack is: "+stackList.size());
		System.out.println("Stack after repeated popping : ");
		while(!stackList.isEmpty()) {

			stackList.printStack();
			stackList.pop();

		}
		stackList.printStack();
	}
}
