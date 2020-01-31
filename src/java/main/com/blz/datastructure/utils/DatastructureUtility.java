package com.blz.datastructure.utils;

import com.blz.algorithm.utils.AlgorithmUtility;
import com.blz.basic.utils.BasicUtility;

public class DatastructureUtility<T extends Comparable<T>> {

	/**
	 * Declaring the Number of Nodes.
	 */
	private Node<T> rear;
	private Node<T> last;
	private Node<T> head;
	private Node<T> prev;
	private Node<T> tail;
	private int size;
	
	/**
	 * @param <T>
	 * Creating the class Node with parameterized Constructor.
	 */
	public class Node<T> {
	      private T data;
	      private Node<T> next;
		  private Node<T> prev;
	    
	      public Node(T data){
	    	  this.data=data;
	    	  this.next = null;
	    	  this.prev = null;
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

		public Node<T> getPrev() {
			return prev;
		}     
	}
	
	/**
	 * Checking Node is Empty or Not.
	 * @return
	 */
	public boolean isEmpty() {
		if(head == null || tail == null)
			return true;
		else
			return false;
	}
	
	/**
	 * @param data
	 * Implementing ADD method.
	 */
	public void add(T data) {
		Node<T> newNode = new Node<T>(data);
		if(head==null)
		head=tail=newNode;
		else {
			tail.next = newNode;
			tail = newNode;
		}
	}
	
	/**
	 * @param data
	 * Implementing SEARCH method.
	 */
	public boolean search(T data) {
		Node<T> temp = head;
			while(temp != null) {
				if(temp.data.equals(data))
					return true;
				temp = temp.getNext();
			}
		return false;
	}
	
	/**
	 * @param data
	 * Implementing DISPLAY method.
	 */
	public void display() {
		if(head==null) {
			System.out.println("Empty...");
		}
		Node<T> temp = head;
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.getNext();
		}
	}
	
	/**
	 * @param data
	 * Implementing toString method.
	 */
	public String toString() {
		if(isEmpty())
			return null;
		else {
			Node<T> temp = head;
			String string = "";
			while(temp != null) {
				if(temp.next != null)
					string = string+temp.getData()+", ";
				else
					string = string+temp.getData();
				temp = temp.getNext();
			}
			return string;
		}
	}
	
	/**
	 * @param data
	 * Implementing SIZE method.
	 */
	public int size() {
		if(isEmpty())
			return 0;
		Node<T> temp = head;
		while(temp != null) {
			size++;
			temp = temp.getNext();
		}
		return size;
	}
	
	/**
	 * @param data
	 * Implementing REMOVE method.
	 */
	public boolean remove(T data) {
		Node<T> temp = head;
		if(temp != null && temp.data.equals(data)) {
			head = temp.getNext();
			temp.next = null;
			size--;
			return true;
		}
		while(temp != null && !(temp.data.equals(data))) {
			prev = temp;
			temp = temp.getNext();
		}
		prev.setNext(temp.getNext());
		size--;
		return true;
	}
	
	/**
	 * @param data
	 * Implementing InsertAtFirst method.
	 */
	public void insertFirst(T data) {
		Node<T> newNode = new Node<T>(data);
		if(isEmpty())
			tail = newNode;
		else {
			head.prev = newNode;
		newNode.next = head;
		head = newNode;
	}
	}
	
	/**
	 * @param data
	 * Implementing InsertAtRear method.
	 */
	public void insertRear(T data) {
		Node<T> newNode = new Node<T>(data);
		if(isEmpty())
			head = newNode;
		else {
			tail.next = newNode;
		newNode.prev = tail;
		tail = newNode;
	}
	}
	
	/**
	 * @param data
	 * Implementing PUSH method.
	 */
	public void push(T data) {
		Node<T> newNode = new Node<T>(data);
		if(head==null) {
			head = newNode;
		}
		else {
			Node<T> temp = head;
			while(temp != null) {
				if(temp.next == null) {
					temp.next = newNode;
				break;	
				}
				temp = temp.getNext();
	
		}
		}
	}
	
	/**
	 * @param data
	 * Implementing PEEK method.
	 */
	public T peek() {
		Node<T> temp = head;
		if(isEmpty())
			return null;
		else {
			T data = null;
			while(temp != null) {
				if(temp.next == null) {
					data = temp.data;
				     break;
				}
				temp = temp.next;
			}
			return data;
	}
	}
	
	/**
	 * @param data
	 * Implementing enQueue method.
	 */
	public void enQueue(T data) {
		Node<T> newnode=new Node<T>(data);
		if(head==null) {
			head=newnode;
		}
		else {
			Node<T> temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			rear=temp.next=newnode;
		}
	}
	
	/**
	 * @param Deposit
	 * @param Amount
	 * @return
	 *  Finding the Deposited Amount.
	 */
	
    public static String deposit(int Deposit,int Amount) { 
    		Amount+=Deposit;  
    			   return "Total Amount is: "+Amount; 
    	}	  
   
    /**
     * @param WithDraw
     * @param Amount
     * @return
     * Finding the WithDraw Amount.
     */
    public static String withdraw(int WithDraw,int Amount) { 
    	if(Amount > 0) {
    		Amount-=WithDraw;   
			   return "Total Amount is: "+Amount; 
    	}
    	else  
    			   return "InSufficient Amount";    
    }
    
    /**
     * @param month
     * @param year
     * @param d
     * Printing the Calendar.
     */
    public static void calendar(int month,int year,int d) {
    	 int[][] arr=new int[month+1][d+1]; 
    	String[] months = {
                "",                
                "January", "February", "March",
                "April", "May", "June",
                "July", "August", "September",
                "October", "November", "December" };   
    	int[] days = {
                0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };	
    	if (month == 2 && BasicUtility.leapYear(year)) days[month] = 29;
    	 System.out.println("   " + months[month] + " " + year);
         System.out.println(" S  M Tu  W Th  F  S");
    	for (int i = 0; i < d; i++)
            System.out.print("   ");
        for (int i = 1; i <= days[month]; i++) {
        	arr[month][d]=i;               
        	 System.out.printf("%2d ", arr[month][d]);
            if (((arr[month][d]+ d) % 7 == 0) || (arr[month][d] == days[month]))  System.out.println();
        }	
    }
    
    public static<T> boolean isPalindrome(T s) {
		if(s.equals(reverse(s)))  return true;
		else   return false;
	}
    
    @SuppressWarnings("unchecked")
	public static<T> T reverse(T s) {
		String reverse="";   
		 for(int i=((String) s).length()-1;i>=0;i--)
		 {
			 reverse+=((String) s).charAt(i);
		 }
		 return (T) reverse;
	}
    
    public static String primeRange(int low,int high) {
		   int[][] arr1=new int[low+1][high+1];  
			System.out.print("arr1["+low+"]["+high+"]: ");
			for(int i=low;i<=high;i++) {
				if(i==1||i==0||i<9) continue;
				int flag=0;
				for(int j=2;j<=i/2;j++) {
					if(i%j==0) {
						flag=1;
						break;
					}
				}
				if(flag==0) {
					if(AlgorithmUtility.reversePrime(i)==1) {  
						arr1[low][high]=i;   
					System.out.print(arr1[low][high]+" ");
			}
				}
			}
			return null;
    }
    
    public static void primeRangeQueue(int low,int high) { 
    	DatastructureUtility<Integer> obj=new DatastructureUtility<Integer>();
			for(int i=low;i<=high;i++) {
				if(i==1||i==0||i<9) continue;
				int flag=0;
				for(int j=2;j<=i/2;j++) {
					if(i%j==0) {
						flag=1;
						break;
					}
				}
				if(flag==0) {
					if(AlgorithmUtility.reversePrime(i)==1) {  
						obj.push(i);
			}
				}
			}
				obj.display();
 }
    
    public static void primeRangeStack(int a,int b) {
    	DatastructureUtility<Integer> stack=new DatastructureUtility<Integer>(); 
		int[][] arr1=new int[a+1][b+1];   	
		for(int i=a;i<=b;i++) {
					if(i==1||i==0||i<9) continue;
					int flag=0;
					for(int j=2;j<=i/2;j++) {
						if(i%j==0) {
							flag=1;
							break;
						}
					}
					if(flag==0) {
						if(anagram(i)==1) {    
							arr1[a][b]=AlgorithmUtility.reverseNumber(i);	   
							stack.push(arr1[a][b]);
						}
						}
				}
					stack.display();
				}
    
    public static int anagram(int number) {
		int rev=0;
		while(number>0) {
		int rem=number%10;
		rev=rev*10+rem;
		number/=10;
		}
			return primeNumber(rev);
	}
    
    public static int primeNumber(int num) {
		   if(num<=1)  return 0;
				for(int k=2;k<=num/2;k++) {
					if(num%k==0) {
						return 0;
					}
				}
					return 1;	
			}
    
    public static String primeRangeTOArray(int low,int high) {
		   int[][] arr1=new int[low+1][high+1];  
			for(int i=low;i<=high;i++) {
				if(i==1||i==0) continue;
				int flag=0;
				for(int j=2;j<=i/2;j++) {
					if(i%j==0) {
						flag=1;
						break;
					}
				}
				if(flag==0) {  
						arr1[low][high]=i;   
					System.out.print(arr1[low][high]+" ");
			}
				}
			return "";
 }
    
    public  void addAndSort(T data)
	{
		Node<T> n = new Node<T>(data);
		if(head == null && last == null)
		{
			head = last = n;
		}
		else if(head.getData().compareTo(data)>=0)
		{
			Node<T> temp = head;
			head = n;
			n.setNext(temp);
		}
		else
		{
			Node<T> temp = head;
			while(temp.getNext()!=null && temp.getNext().getData().compareTo(data)<0)
			{
				temp = temp.getNext();
			}
			
			if(temp.getNext()==null)
			{
				last.setNext(n);
				last = n;
			}
			else
			{
				Node<T> prev = temp.getNext();
				temp.setNext(n);
				n.setNext(prev);
			}
		}
	}
  
    public static boolean areMaching(char char1,char char2) {
		if(char1=='(' && char2==')')  return true;
		if(char1=='{' && char2=='}')  return true;
		if(char1=='[' && char2==']')  return true;
		else  return false;
	}
    
    public static boolean checkMaching(char[] ch) {
		DatastructureUtility<Character> stack=new DatastructureUtility<Character>();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='(' && ch[ch.length-1-i]==')' || ch[i]=='{' && ch[ch.length-1-i]=='}' || ch[i]=='[' && ch[ch.length-1-i]==']')  return true;
			if(ch[i]=='(' || ch[i]=='{' || ch[i]=='[')  stack.push(ch[i]);
			if(ch[i]==')' || ch[i]=='}' || ch[i]==']') {
				if(stack.isEmpty())  return false;
				else if(!areMaching(stack.popFirst(),ch[i]))  return false;
			}
		}
		if(stack.isEmpty())
			return true;
		else
		return false;
    }
    
		public T popFirst()
		{
			if(isEmpty())
				return null;
				Node<T> temp = head;
		head = temp.next;		
				return temp.data;
				
			
		}
		
}


