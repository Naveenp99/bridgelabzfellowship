package com.bridgelabz.datastructure.base;

public class Methods<T extends Comparable<T>> {

	private Node<T> head;
	private Node<T> tail;
	private int size;
	private Node<T> last;
	private Node<T> rear;
	private Node<T> prev;
	private Node<T> First;
	private Node<T> top;

	public class Node<T> {
		private T data;
		private Node<T> next;
		private Node<T> prev;
		private Node<T> last;

		public Node(T data) {
			this.data = data;
			this.next = null;
			this.prev = null;
		}

		public T getData() {
			return data;
		}

		public Node<T> getNext() {
			return next;
		}

		public void setNext(Node<T> next) {
			this.next = next;
		}

	}

	/*
	 * public interface Iterator<T> { public boolean hasNext(); public T Next(); }
	 * 
	 * private class ListIterator<T> implements Iterator<T>{ private Node<T>
	 * iterator;
	 * 
	 * @Override public boolean hasNext(){ return (iterator.getNext() != null); }
	 * 
	 * @Override public T Next() { T userData = iterator.getData(); iterator =
	 * iterator.getNext(); return userData; }
	 * 
	 * }
	 */

	public boolean search(T data) {
		Node<T> n = head;
		while (n != null) {
			if (n.getData().compareTo(data) == 0)
				return true;
			n = n.getNext();
		}
		return false;
	}

	public void addNode(T data) {

		Node<T> node = new Node(data);
		if (head == null) {
			head = node;
			tail = node;
		} else {
			tail.next = node;
			tail = node;
		}
	}

	public int size() {
		Node<T> n = head;
		while (n != null) {
			size++;
			n = n.next;
		}
		return size;
	}

	public void removeRandom(T data) {
		Node<T> n = head;
		if (n != null && (n.data.equals(data)))
			n = n.getNext();
		while (n != null && !(n.data.equals(data))) {
			prev = n;
			n = n.next;
		}
		if (n != null) {
			prev.next = n.next;
		}
	}

	public boolean isEmpty() {
		if (head == null && last == null)
			return true;
		else
			return false;
	}

	public void display() {

		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		while (head != null) {
			System.out.print(head.getData() + " ");
			head = head.getNext();
		}
		System.out.println();
	}

	public String toString() {
		String str = "";
		Node<T> n = head;
		while (n != null) {
			if (n.getNext() != null)
				str += n.getData() + " ";
			else
				str += n.getData();
			n = n.getNext();
		}
		return "[" + str + "]";
	}

	public T popLast() {
		T data = null;
		Node<T> n = head;
		Node<T> prev = null;
		while (n.getNext() != null) {
			prev = n;
			n = n.getNext();
		}
		prev.next = n.next;
		return n.getData();
	}

	public T popFirst() {
		if (isEmpty())
			return null;
		Node<T> n = head;
		head = n.next;
		return n.getData();
	}

	public T dequeue() {
		if (isEmpty())
			return null;
		else if (head.getNext() != null) {
			T data = head.getData();
			head = head.getNext();
			return data;
		} else {
			T data = head.getData();
			head = head.getNext();
			return data;
		}
	}

	public void enqueue(T data) {
		Node<T> node = new Node<T>(data);
		if (head == null) {
			head = node;
		} else {
			Node<T> n = head;
			while (n.next != null) {
				n = n.next;
			}
			rear = n.next = node;
		}
	}

	public T peek() {
		if (head.getData() == null)
			return null;
		else
			return head.getData();
	}

	public void add(T data) {
		Node<T> node = new Node<T>(data);
		if (head == null && last == null)
			head = last = node;
		else if (head.getData().compareTo(data) > 0) {
			Node<T> temp = head;
			head = node;
			node.setNext(temp);
		} else {
			Node<T> temp = head;
			while (temp.getNext() != null && temp.getNext().getData().compareTo(data) < 0) {
				temp = temp.getNext();
			}
			if (temp.getNext() == null) {
				temp.setNext(node);
				temp = node;
			} else {
				Node<T> prev = temp.getNext();
				temp.setNext(node);
				node.setNext(prev);
			}
		}
	}

	public void push(T data) {
		Node<T> node = new Node<T>(data);
		if (head == null)
			head = node;
		else {
			Node<T> temp = head;
			while (temp != null) {
				if (temp.next == null) {
					temp.next = node;
					break;
				}
				temp = temp.next;
			}
		}
	}

	public void addFront(T data) {
		Node<T> node = new Node<T>(data);
		node.data = data;
		if (isEmpty())
			tail = node;
		else
			head.prev = node;
		node.next = head;
		head = node;
	}

	public void insertAtStart(T data) {
		Node<T> node = new Node<T>(data);
		node.data = data;
		node.next = null;
		node.next = head;
		head = node;
	}

	public void insert(int index, T data) {
		if (index == 0)
			insertAtStart(data);
		Node<T> node = new Node<T>(data);
		node.data = data;
		node.next = null;
		Node<T> temp = head;
		for (int i = 1; i < index - 1; i++) {
			temp = temp.getNext();
		}
		node.next = temp.next;
		temp.next = node;
	}

	public void removeFirst(T data) {
		Node<T> n;
		Node<T> remove = null;
		n = head;
		if (head.data.equals(data)) {
			head = head.next;
			size--;
		}
		while (!n.data.equals(data)) {
			remove = n;
			n = n.next;
		}
		n = n.next;

		n = null;
		size--;
	}

	public boolean deQueue() {
		if (head == null && last == null)
			return true;
		return false;
	}

	public boolean remove(T data) {
		Node<T> temp = head;
		if (temp != null && temp.data.equals(data)) {
			head = temp.next;
			temp.next = null;
			size--;
			return true;
		}
		while (temp != null && temp.data.compareTo(data) != 0) {
			prev = temp;
			temp = temp.getNext();
		}
		if (temp == null)
			return false;
		prev.setNext(temp.getNext());
		size--;
		return true;
	}

	public static void main(String[] args) {
		Methods<String> m = new Methods<String>();
		Methods<String> push = new Methods<String>();

		m.addNode("30");
		m.addNode("40");
		m.addNode("20");
		m.addNode("60");
		m.addNode("50");
		m.addNode("70");
		m.addNode("10");
		m.addFront("80");
		m.addFront("90");
		m.remove("60");
		m.display();
		/*
		 * push.push("90"); push.push("0"); push.push("05"); push.display();
		 */
	}
}
