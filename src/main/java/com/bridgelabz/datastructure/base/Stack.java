package com.bridgelabz.datastructure.base;

public class Stack<T> {
	public class Node<T> {
		T data;
		Node<T> next;
		public Node(T data) {
			this.data=data;
			next=null;
		}
	}
      public Node<T> head;
      private Node<T> First=null;
      public Node<T> top;
      
      
      public T peek(T data) {
      	  if(First==null) 
      		  return null;
      	  else 
      		  return First.data;
        }
      
      
      public void push(T data) {
    	  Node<T> node=new Node<T>(data);
    	  node.data=data;
    	  node.next=null;
    	  if(head==null) {
    		  head=node;
    		  top=node;
    	  }
    	  else
    	  {
    		  while(head.next!=null) {
    			  head=head.next;
    		  }
    		  head.next=node;
    		  top=node;
    	  }
      }
      
      
      public void show() {
    	  while(head.next!=null) {
    		  System.out.print(head.next+" ");
    		  head=head.next;
    	  }
    	  System.out.print(head.data+" ");
      }
      
      
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
      
      
      public T pop() {
    	  if(isEmpty())  return null;
    	  else if(size()==1) {
    		  head=null;
    		  T data=top.data;
    		  top=null;
    		  return data;
    	  }
    	  else {
    		  while(head.next!=null) {
    			  head=head.next;
    		  }
    		  T data=top.data;
    		  head.next=null;
    		  top=head;
    		  top=null;
    		  return data;
    	  }
      }
      
      
      public boolean isEmpty() {
		return false;
	}
      
      public static void main(String[] args) {
    	  
      }
}
