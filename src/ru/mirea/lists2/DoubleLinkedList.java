package ru.mirea.lists2;

public class DoubleLinkedList<T> implements MyList<T>
{
	private static class Node<T> {
		public T data;
		public Node<T> prev = null, next = null;

		public Node(T data) {
			this.data = data;
		}
	}

	private Node<T> head = null, tail = null;
	int size;

	private void pop_element(Node<T> curr) {
		if (curr == null)
			return;
		size--;
		if (size == 0) {
			clear();
		}
		else if (curr == head) {
			head = head.next;
			head.prev = null;
		}
		else if (curr == tail) {
			tail = tail.prev;
			tail.next = null;
		}
		else {
			curr.prev.next = curr.next;
			curr.next.prev = curr.prev;
		}
	}

	public void add(T value) {
		add(value, size);
	}

	@Override
	public void add(T value, int at)
	{
		size++;
		if (at < 0 || at >= size) {
			throw new IndexOutOfBoundsException();
		}
		Node<T> new_node = new Node<T>(value);
		if (size == 1) {
			head = tail = new_node;
		}
		else if (at == size - 1) {
			new_node.prev = tail;
			tail.next = new_node;
			tail = new_node;
		}
		else {
			Node<T> temp = head;
			for (int i = 0; i < at; i++) {
				temp = temp.next;
			}
			new_node.next = temp;
			new_node.prev = temp.prev;
			if (temp == head)
				head = new_node;
			else
				temp.prev.next = new_node;
			temp.prev = new_node;
		}
	}

	public void delete(T data) {
		Node<T> prev = null, temp = head;
		for (int i = 0; i < size; i++) {
			if (temp.data.equals(data)) {
				pop_element(temp);
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
		Node<T> temp = head;
		for (int i = 0; i < at; i++) {
			temp = temp.next;
		}
		pop_element(temp);
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
		StringBuilder out = new StringBuilder("DoubleLinkedList(");
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
