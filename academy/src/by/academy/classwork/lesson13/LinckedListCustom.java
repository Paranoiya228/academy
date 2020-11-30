package by.academy.classwork.lesson13;

public class LinckedListCustom<T> {

	private Node<T> head;
	private Node<T> tail;

	class Node<T> {

		T value;
		Node<T> next;
		Node<T> prev;

		Node(T value) {
			this.value = value;
		}
	}

	public void add(T value) {

		Node<T> node = new Node<>(value);

		if (head == null) {
			head = node;
			tail = node;
		} else {
			tail.next = node;
			node.prev = tail;
			tail = node;
		}

	}

}
