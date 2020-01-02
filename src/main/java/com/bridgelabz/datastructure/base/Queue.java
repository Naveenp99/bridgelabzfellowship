package com.bridgelabz.datastructure.base;

public class Queue<T> {
	
	
	@SuppressWarnings("hiding")
	
	public class Node<T> {
		T data;
		Node<T> next;
		public Node(T data) {
			this.data=data;
			next=null;
		}
	}
	
	public Node<T> head;
	public Node<T> rear;
	
	
	public int size() {
		 int count=1;
    	 if(head==null) return 0;
    	 else {
    		 while(head.next!=null) {
    			 head=head.next;
    			 count++;
    		 }
    		 return count;
    	 }
	}
	
	
	public boolean isEmpty() {
		return false;
	}
	
	
	public T dequeue() {
		if(isEmpty()) return null;
		else if(head.next==null) {
				T data=head.data;
				head=null;
				return data;
			}
			else {
				head=head.next;
				T data=(T) head.data;
				head=null;
				return data;
			}
		}
	
	
	public void enqueue(T data) {
		Node<T> node=new Node<T>(data);
		node.data=data;
		node.next=null;
		if(head==null) {
			head=node;
			rear=node;
		}
		else {
			while(head.next!=null) {
				head=head.next;
			}
			head.next=node;
			rear=node;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
