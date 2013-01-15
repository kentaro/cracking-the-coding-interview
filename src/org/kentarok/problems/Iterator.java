package org.kentarok.problems;

public class Iterator<T> {
	private Node<T> current = null;

	public Iterator(Node<T> root) {
		this.current = root;
	}

	public boolean hasNext() {
		return current.getNext() != null;
	}

	public Node<T> next() {
		Node<T> next = current.getNext();
		current = next;
		return next;
	}

	public Node<T> getCurrent() {
		return current;
	}

	public void setCurrent(Node<T> node) {
		current = node;
	}
}
