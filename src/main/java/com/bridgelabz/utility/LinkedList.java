package com.bridgelabz.utility;

import com.bridgelabz.utility.Stack.Node;

public class LinkedList<T extends Comparable<T>> {

	private Node<T> head;
	private Node<T> prev;
	private Node<T> tail;
	private int size;
	private  Node<T> last;
	
	public class Node<T> {
	      private T data;
	      private Node<T> next;
	    
	      public Node(T data){
	    	  this.data=data;
	    	  this.next=null;
	      }
	      
	      public T getData() {
	    		return data;
	    	}
	      
	      public Node<T> getNext(){
	    	  return next;
	      }
	      
	      public void setNext(Node<T> next) {
	          this.next = next;
	      }
	      
	}
	
	public void addNode(T data) {  
		  
		Node<T> node = new Node(data);  
	    if(head == null) {    
	        head = node;  
	        tail = node;  
	    }
	    else {  
	        tail.next = node;
	        tail = node;  
	    }  
	}
	
	public boolean search(T data) {
		Node<T> n=head;
		while(n!=null) {
			if(n.getData().compareTo(data)==0)  return true;
				n=n.getNext();
		}
	             return false;	
	}

	public void display() {    
	    
	    if(head == null) {  
	        System.out.println("List is empty");  
	        return;  
	    }  
	    while(head != null) {  
	         System.out.print(head.getData() + " ");  
	        head = head.getNext();  
	    } 
	}
	
	public boolean isEmpty() {
		if(head==null && last==null) return true;
		else    return false;
	}
	
	public int size() {
     	Node<T> n=head;
	     while(n!=null) {
	      	size++;
		      n=n.next;
	          }
	      return size;
}
	
	public T popLast() {
		T data=null;
		Node<T> n=head;
		Node<T> prev=null;
		while(n.getNext()!=null) {
			 prev = n; 
	         n = n.getNext(); 
		}
		prev.next = n.next;
		return n.getData();
	}
	
	public T popFirst() {
		  if(isEmpty())  return null;
		  Node<T> n=head;
		  head=n.next;  
		return n.getData();
	}

	public boolean remove(T data) {
		Node<T> temp=head;
			if(temp!=null  && temp.data.equals(data))  {
			head=temp.getNext();
			temp.next=null;
			size--;
			return true;
		}
		while(temp!=null && temp.data.compareTo(data)!=0) {
			prev=temp;
			temp=temp.getNext();
		}
		if(temp==null)  return false;
		prev.setNext(temp.getNext());
		size--;
		return true;
	}

	
	public void insertAtStart(T data) {
		Node<T> node=new Node<T>(data);
		node.data=data;
		node.next=null;
		node.next=head;
		head=node;
	}
	public void insert(int index,T data) {
		if(index==0)  insertAtStart(data);
		Node<T> node=new Node<T>(data);
		node.data=data;
		node.next=null;
		Node<T> temp=head;
		for(int i=1;i<index-1;i++) {
			temp=temp.getNext();
		}
		node.next=temp.next;
		temp.next=node;
	}

	public void push(T data) {
		Node<T> newnode=new Node<T>(data);
		if(head==null)  head=newnode;
		else {
			Node<T> temp=head;
			while(temp!=null) {
				if(temp.next==null)  {
					temp.next=newnode;
					break;
				}
				temp=temp.getNext();
			}
		}
	}
	
	
	
	public void removeFirst(T data) {
		Node<T> n;
		Node<T> remove=null;
		n=head;
		if(head.data.equals(data)) {
			head=head.next;
			size--;
		}
		while(!n.data.equals(data)) {
			remove=n;
			n=n.next;
		}
		n=n.next;

		n=null;
		size--;
		}
	
	public void removeRandom(T data) {
	    Node<T> n = head;
	    if(n!=null && (n.data.equals(data)))  n=n.getNext();
	   while(n!=null && !(n.data.equals(data)))
	   {
		   prev = n;
		   n=n.next;
	   }
	   if(n!=null)
	   {
		   prev.next=n.next;
	   }
		   }

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub

	}*/

}
