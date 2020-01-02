package com.bridgelabz.datastructure.base;

public class LinkedList<T> {
public Node<T> tail=null;
public Node<T> head=null;
private int size;
	public class Node<T>{
		T data;
		Node<T> next;
		Node<T> prev;
		public Node(T data) {
			this.data=data;
			this.next=null;
			this.prev=null;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
public void InsertAtStart(T data) {
	Node<T> node=new Node<T>(data);
	node.data=data;
	if(isEmpty()) 	tail=node;
	else  head.prev=node;
	node.next=head;
	head=node;
}

private boolean isEmpty() {
	return false;
}
public void InsertAtEnd(T data) {
	Node<T> node=new Node<T>(data);
	node.data=data;
	if(isEmpty()) 	head=node;
	else  tail.next=node;
	node.prev=tail;
	tail=node;
}
public void InsertAt(int index,T data) {
	Node<T> node=new Node<T>(data);
	node.data=data;
	if(index==0) {
		tail=node;
		head=node;
	}
	else {
		Node<T> n=head;
		for(int i=0;i<index-1;i++) {
			n=n.next;
		}
		Node<T> p=head.next;
		node.prev=n;
		n.next=node;
		node.next=p;
		p.prev=node;
		System.out.println(node.next.data);
		System.out.println(node.prev.data);
	}
}
public String toString() {
	String str="";
	Node<T> n=head;
	while(n!=null) {
		if(n.next!=null) str+=n.data+" ";
		else  str+=n.data;
	n=n.next;
	}
	return "["+str+"]";
}
public int size() {
	Node<T> n=head;
	while(n!=null) {
		size++;
		n=n.next;
	}
	return size;
}
public boolean remove(T data) {
	Node<T> n=head;
	if(n!=null && n.data) {
		n=n.next;
		size--;
		return true;
	}
}
}
