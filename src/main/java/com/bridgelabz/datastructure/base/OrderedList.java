package com.bridgelabz.datastructure.base;
import com.bridgelabz.utility.*;
import java.io.*;
import java.util.StringTokenizer;
public class OrderedList<T extends Comparable<T>> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  // Take the Input from the file.
		//Put appropriate path location in FileReader.
		try{
			FileReader fr=new FileReader("/home/user/eclipse-workspacefinal/bridgelabz/src/main/java/com/bridgelabz/datastructure/base/number.txt");
			BufferedReader br=new BufferedReader(fr);
			BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
			OrderedList<Integer> list=new OrderedList<Integer>();  //Creating OrderedList Integer Object. 
			String s="";
			while((s=br.readLine())!=null)
			{
				StringTokenizer st=new StringTokenizer(s," ");
				while(st.hasMoreTokens())
				{
					//Converting from String to Integer.
					int number=Integer.parseInt(st.nextToken());
					 list.add(number);	   //Adding numbers to list.
				}
			}
			br.close();
			fr.close();
			Boolean bool=true;
			System.out.print("\n1.Search number\t2.Sort numbers\t3.Display List\t4.Terminate\n\n");
			while(bool)
			{
				System.out.print("Enter your choice : ");
				int n=Integer.parseInt(b.readLine());
				switch(n)
				{
					case 1:
						System.out.print("Enter the number : ");
						int search=Integer.parseInt(b.readLine());
				//if Searched data is present then remove from the list.		
					if(list.search(search)==true) {
						list.Remove(search);
					}
					//if Searched data is NOT present then add to the list.
						else if(list.search(search)==false){
						list.add(search);
					}
						break;
				// if new data came then add it according to the Sorted Order.		
					case 2:
						System.out.print("Enter the number : ");
						int data1=Integer.parseInt(b.readLine());
						System.out.print("Sorted List : ");
						list.add(data1);
						break;
						// Display the Result.
					case 3:
						System.out.println("Data : ");
						list.display();
						break;
					case 4:
						// list.addIntoFile(list);
						System.out.println("\n-------    Data successfully saved     -------\n");
						bool=false;
						break;
					default:
						System.out.println("Wrong Input");
				}
			}
		}catch(Exception e){System.out.println(e);}
	}		
		
	public class Node<T>{
	
		T data;
		Node<T> next;
		public Node(T data) {
			this.data=data;
			this.next=next;
	}
		public T getData() {
			return data;
	}
		public Node<T> getNext(){
			return next;
		}
		public void setNext(Node<T> next) {
		this.next=next;
		}
	}
	private Node<T> head;
	private Node<T> last;
	private Node<T> tail;
	private int size;
	
	
	@Override
	public String toString() 
	{
		String s = "";
		Node<T> temp = head;
		while(temp != null)
		{
			if(temp.getNext()!=null)
				s = s+temp.getData()+",";
			else
				s = s+temp.getData();
			temp = temp.getNext();
		}
		return "["+s+"]";
	}
	// To display the Result.
	public void display() {
		if(head==null || last==null) {
			System.out.println("List is Empty");
			return;
		}
		Node<T> temp=head;
		while(temp!=null) {
			System.out.println(temp.data+" ");
			temp=temp.getNext();
		}
	}
	
	//To add an element to OrderedList
	public  void add(T data)
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
	
//To calculate the size	
public int size()
{
	Node<T> temp = head;
	while(temp!=null)
	{
		size++;
		temp = temp.getNext();
	}
	return size;
}


//To remove and return last item from list
public boolean Remove(T data)
{
	Node<T> temp =  head;
	Node<T> prev = null;
	
	if(temp != null && temp.getData().compareTo(data)==0)
	{
		head = temp.getNext();
		temp.next=null;
		size--;
		return true;
	}
	while(temp != null && (temp.getData().compareTo(data)!=0))
			{
		prev = temp;
		temp = temp.getNext();
			}
	if(temp == null)
		return false;
	
	prev.setNext(temp.getNext());
	size--;
	return true;
	
}

//To check whether list is empty or not
public boolean isEmpty()
{
	if(head == null && last == null)
		return true;
	return false;
}

//To search an item in a list
public boolean search(T data)
{
	Node<T> temp = head;
	while(temp!=null)
	{
		if(temp.getData().compareTo(data)==0)
			return true;
		temp = temp.getNext();
	}
	return false;
	
}

//To remove and return last item in list
public T pop()
{
		T data = null;
		Node<T> temp = head;
		while(temp.getNext()!=null)
		{
			temp = temp.getNext();
		}
		data = temp.getData();
		last = temp;
		last.setNext(null);
		return data;
		
	
}
}
	


