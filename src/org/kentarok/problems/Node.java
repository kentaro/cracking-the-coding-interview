package org.kentarok.problems;

public class Node<T> {
	private T data;
	private Node<T> next = null;
	
	public Node(T data) {
		this.data = data;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> node) {
		next = node;
	}

	public T getData() {
		return data;
	}
}
