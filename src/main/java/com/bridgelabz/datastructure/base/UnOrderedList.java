package com.bridgelabz.datastructure.base;
import java.util.*;
public class UnOrderedList<T extends Comparable<T>> {
	static LinkedList<Integer> list=new LinkedList<>();
public Node<T> head;
public Node<T> next=null;
public Node<T> tail=null;
	public static void main(String[] args) {
	LinkedList<Integer> l=new LinkedList<Integer>();
		UnOrderedList ll=new UnOrderedList();
	}
	
	
	public class Node<T> {
		T data;
		Node<T> next;
		public Node(T data) {
			this.data=data;
			this.next=null;
		}
	}
	
	
	   public void addNode(int data) {  
		  
			Node<T> newNode = new Node(data);  
	        if(head == null) {    
	            head = newNode;  
	            tail = newNode;  
	        }
	        else {  
	            tail.next = newNode;   
	            tail = newNode;  
	        }  
	    }
	   public void display() {    
	          
	        if(head == null) {  
	            System.out.println("List is empty");  
	            return;  
	        }  
	        while(head != null) {  
	             System.out.print(head.data + " ");  
	            head = head.next;  
	        }  
	        System.out.println();  
	    }
	   public void add(T data) {
		   Node<T> newnode;
		   newnode=new Node<T>(data);
		   if(head== null)  head = newnode; 
		   else {
			   while(head.data!=null) {
				   Node<T> index=head.next;
				   while(index!=null) {
					   if((head.data).compareTo(index.data)>0) {
						   T temp=head.data;
						   head.data=index.data;
						   index.data=temp;
					   }
					   index=index.next;
				   }
				   head=head.next;
			   }
		   }
	   }
}
