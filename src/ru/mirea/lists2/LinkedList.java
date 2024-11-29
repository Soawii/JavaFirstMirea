package ru.mirea.lists2;

public class LinkedList<T> implements MyList<T>
{
	private static class Node<T> {
		public T data;
		public Node<T> next = null;

		public Node(T data) {
			this.data = data;
		}
	}

	private Node<T> head = null, tail = null;
	int size;

	private void pop_element(Node<T> curr, Node<T> prev) {
		if (curr == null)
			return;
		size--;
		if (prev != null) {
			prev.next = curr.next;
		}
		else {
			head = head.next;
		}

		if (tail == curr) {
			tail = prev;
		}
	}

	public void add(T value) {
		add(value, size);
	}

	@Override
	public void add(T value, int at)
	{
		if (at < 0 || at > size) {
			throw new IndexOutOfBoundsException();
		}
		size++;
		Node<T> new_node = new Node<T>(value);
		if (size == 1) {
			head = tail = new_node;
		}
		else if (at == size - 1) {
			tail.next = new_node;
			tail = tail.next;
		}
		else {
			Node<T> prev = null, temp = head;
			for (int i = 0; i < at; i++) {
				prev = temp;
				temp = temp.next;
			}
			new_node.next = temp;
			if (temp == head)
				head = new_node;
			else
				prev.next = new_node;
		}
	}

	public void delete(T data) {
		Node<T> prev = null, temp = head;
		for (int i = 0; i < size; i++) {
			if (temp.data.equals(data)) {
				pop_element(temp, prev);
				return;
			}
			prev = temp;
			temp = temp.next;
		}
	}

	@Override
	public void pop(int at)
	{
		if (at < 0 || at >= size) {
			throw new IndexOutOfBoundsException();
		}
		Node<T> prev = null, temp = head;
		for (int i = 0; i < at; i++) {
			prev = temp;
			temp = temp.next;
		}
		pop_element(temp, prev);
	}

	public void clear() {
		head = null;
		size = 0;
		tail = null;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public T at(int index)
	{
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();
		}
		Node<T> temp = head;
		for (int i = 0; i < index; i++) {
			temp = temp.next;
		}
		return temp.data;
	}

	@Override
	public String toString() {
		StringBuilder out = new StringBuilder("LinkedList(");
		Node<T> temp = head;
		for (int i = 0; i < size; i++) {
			if (i > 0)
				out.append(",");
			out.append(temp.data.toString());
			temp = temp.next;
		}
		return out.append(")").toString();
	}
}
