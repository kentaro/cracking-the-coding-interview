package org.kentarok.problems;

import java.util.Hashtable;

// とりあえず非効率バージョン
public class LinkedList<T> {
	private Node<T> root;

	public LinkedList() {
		root = new Node<T>(null);
	}

	public Iterator<T> iterator() {
		return new Iterator<T>(root);
	}

	public void append(T data) {
		Iterator<T> iterator = iterator();
		Node<T> node = iterator.getCurrent();

		while (iterator.hasNext()) {
			node = iterator.next();
		}

		node.setNext(new Node<T>(data));
	}

	public void uniquify() {
		Hashtable<T, Boolean> hash = new Hashtable<T, Boolean>();
		Iterator<T> iterator = iterator();
		Node<T> prev = iterator.getCurrent();

		while (iterator.hasNext()) {
			Node<T> next = iterator.next();

			if (!hash.containsKey(next.getData())) {
				prev.setNext(next);
				prev = next;
				hash.put(next.getData(), true);
			}
		}
	}

	public Node<T> nthToLast(Integer n) {
		int last = 0;
		Iterator<T> iterator = iterator();

		while (iterator.hasNext()) {
			iterator.next();
			last++;
		}

		int i = 0;
		iterator = iterator();
		Node<T> node = null;

		while (iterator.hasNext()) {
			node = iterator.next();
			if (i == last - n) break;
			i++;
		}

		return node;
	}
}
