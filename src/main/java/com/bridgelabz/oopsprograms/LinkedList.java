package com.bridgelabz.oopsprograms;

public class LinkedList {

	private Node head;
	private Node prev;
	    public class Node{
		private Node next;
		private Object data;
		
		public Node(Object data) {
			this.data = data;
		}
		
		/**
		 * @return the next
		 */
		public Node getNext() {
			return next;
		}
		/**
		 * @param next the next to set
		 */
		public void setNext(Node next) {
			this.next = next;
		}
		/**
		 * @return the data
		 */
		public Object getData() {
			return data;
		}
		/**
		 * @param data the data to set
		 */
		public void setData(Object data) {
			this.data = data;
		}
	}
	
	public void pushObject(Object data) {
		Node node = new Node(data);
		if(head==null)  head = node;
		else {
			Node temp=head;
			while(temp!=null) {
				if(temp.next == null) {
					temp.next = node;
					break;
				}
				temp = temp.next;
			}
		}
	}
	
	@SuppressWarnings("unused")
	public void removeObject(Object data) {
		int size = 0;
		Node temp=head;
		if(head != null && temp.data.equals(data))  {
			head = temp.next;
			temp.next = null;
		}
		while(temp != null && !(temp.data.equals(data))) {
			prev = head;
			temp = temp.getNext();
		}
		if(head == null)  return;
		prev.setNext(temp.getNext());
	}
	
	public void add(Object data) {
		Node node = new Node(data);
		if (head == null)
			head = node;
		else {
			Node temp = head;
			if (temp.getNext() == null) {
				temp.setNext(node);
				temp = node;
			} 
			else {
				Node prev = temp.getNext();
				temp.setNext(node);
				node.setNext(prev);
			}
		}
	}
	
	
	public void displayObject() {
		if(head == null)   {
			System.out.println("List is Empty");
			return;
		}
		Node temp=head;
		while(temp != null)  {
			System.out.print(temp.data+" ");
			temp = temp.getNext();
		}
	}
	
	
}
