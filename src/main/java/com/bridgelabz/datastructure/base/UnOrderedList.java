package com.bridgelabz.datastructure.base;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class UnOrderedList<T> {
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
				int n=Integer.parseInt(b.readLine());
				switch(n)
				{
					case 1:
						System.out.print("\nEnter the search name : ");
						String search=b.readLine();
						if(list.search(search)==true)
						list.Remove(search);
						else if(list.search(search)==false)
							list.add(search);
						break;
					case 2:
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
