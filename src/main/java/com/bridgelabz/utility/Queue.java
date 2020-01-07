package com.bridgelabz.utility;

public class Queue<T> {

	private Node<T> head;
	private Node<T> tail;
	private Node<T> prev;
	private int size;
	private  Node<T> last;
    private  Node<T> rear;
	
public class Node<T> {
      private T data;
      private Node<T> next;
	public Queue<T>.Node<T> prev;
    
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
      
      public void enqueue(T data) {
    		Node<T> node=new Node<T>(data);
    		if(head==null) {
    			head=node;
    		}
    		else {
    			Node<T> n=head;
    			while(n.next!=null) {
    				n=n.next;
    			}
    			rear=n.next=node;
    		}
    	}
      
     /* public boolean deQueue() {    
    	    if(head==null && last==null)   return true; 
    	    	return false; 
    	}*/
	
   public T dequeue() {
	   if(isEmpty()) return null;
	     else if(head.getNext()!=null) {
			T data=head.getData();
			head=head.getNext();
			return data;
		}
		    else {
			T data=head.getData();
			head=head.getNext();
			return data;
		}
	}
	
   public int size() {
    	Node<T> n=head;
	     while(n!=null) {
	      	size++;
		      n=n.next;
	          }
	      return size;
}

   public void addFront(T data) {
		Node<T> node=new Node<T>(data);
		node.data=data;
		if(isEmpty()) 	tail=node;
		else  head.prev=node;
		node.next=head;
		head=node;
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
   
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub

	}*/

}
