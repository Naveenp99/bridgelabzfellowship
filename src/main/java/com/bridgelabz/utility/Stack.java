package com.bridgelabz.utility;

public class Stack<T> {
	
	private Node<T> head;
	private int size;
	private  Node<T> last;
	
	public class Node<T> {
	      private T data;
	      private Node<T> next;
	      
	      public Node(T data){
	    	  this.data=data;
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

	public boolean isEmpty() {
		if(head==null && last==null) return true;
		else    return false;
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
	
	public T popFirst() {
		  if(isEmpty())  return null;
		  Node<T> n=head;
		  head=n.next;  
		return n.getData();
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
	
	public T peek() {
		  if(head.getData()==null) 
			  return null;
		  else 
			  return head.getData();
	  }
	
	 public int size() {
	     	Node<T> n=head;
		     while(n!=null) {
		      	size++;
			      n=n.next;
		          }
		      return size;
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
//		    System.out.print();  
		}
	 
	/*public static void main(String[] args) {
	// TODO Auto-generated method stub
}*/
	 
}
