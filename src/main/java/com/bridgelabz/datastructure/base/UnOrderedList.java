package com.bridgelabz.datastructure.base;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class UnOrderedList<T> {
	// Creating the Node.
	public class Node<T>{
		
		T data;
		Node<T> next;
		// Creating the Constructor for Node.
		public Node(T data) {
			this.data=data;
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
	private int size;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 // Take the Input from the file.
		//Put appropriate path location in FileReader.
		try{
			FileReader fr=new FileReader("/home/user/eclipse-workspacefinal/bridgelabz/src/main/java/com/bridgelabz/datastructure/base/string.txt");
			BufferedReader br=new BufferedReader(fr);
			BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
			UnOrderedList<String> list=new UnOrderedList<>();
			String s="";
			while((s=br.readLine())!=null)
			{
				StringTokenizer st=new StringTokenizer(s," ");
				while(st.hasMoreTokens())
				{
					String name=st.nextToken();
					list.add(name);	
				}
			}
			br.close();
			fr.close();
			Boolean bool=true;
			System.out.print("\n1.Search\t2.Display List\t3.Terminate\n\n");
			while(bool)
			{
				System.out.print("\nEnter your choice : ");
				//Converting from String to Integer.
				int n=Integer.parseInt(b.readLine());
				switch(n)
				{
					case 1:
						System.out.print("\nEnter the search name : ");
						String search=b.readLine();
						//if Searched data is present then remove from the list.
						if(list.search(search)==true)
						list.Remove(search);
						//if Searched data is NOT present then add to the list.
						else if(list.search(search)==false)
							list.add(search);
						break;
					case 2:
						// Displaying the Result.
						list.display();;
						break;
					case 3:
						
						System.out.println("\n-------    Data successfully saved     -------\n");
						bool=false;
						break;
					default:
						System.out.println("\nWrong Input");
				}
			}
		}catch(Exception e){System.out.println(e);}	
		
	}
	//This Method is used to Search the Data is Found or Not.
	public boolean search(T data)
	{
		Node<T> temp = head;
		while(temp!=null)
		{
			if(temp.data.equals(data))
				return true;
			temp = temp.next;
		}
		return false;
	}
	//Used to Display the result.
	public void display() {
		if(head==null || last==null) {
			System.out.println("List is Empty");
			return;
		}
		Node<T> temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.getNext();
		}
	}
	// It will ADD the given Data to the List.
	public void add(T data)
	{
		Node<T> node=new Node<T>(data);
		if(head==null)
			head=node;
		else
		{
			 last=head;
			while(last.next!=null)
				last=last.next;
			last.next=node;
		}
	}
	// Used to REMOVE the data from the list.
	public boolean Remove(T data)
	{
		Node<T> temp =  head;
		Node<T> prev = null;
		
		if(temp != null && temp.getData().equals(data))
		{
			head = temp.getNext();
			temp.next=null;
			size--;
			return true;
		}
		while(temp != null && (!temp.getData().equals(data)))
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
	// Used to add data into the given FILE.
	public void addIntoFile(String key)
	{
		Node<T> current=head;
		try
		{
			FileWriter fw=new FileWriter("/home/user/eclipse-workspacefinal/bridgelabz/src/main/java/com/bridgelabz/datastructure/base/string.txt");
			while(current!=null)
			{
				fw.write(current.data+" ");
				current=current.next;
			}
			fw.close();
		}catch(Exception e){System.out.println(e);}
	}

}
