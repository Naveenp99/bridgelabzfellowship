package com.blz.datastructure;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import com.blz.datastructure.utils.DatastructureUtility;


public class OrderedList<T> {

	public static void main(String[] args) {
		try{
			FileReader fr=new FileReader("/home/user/eclipse-workspacefinal/bridgelabz/number.txt");
			BufferedReader br=new BufferedReader(fr);
			BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
			DatastructureUtility<Integer> list=new DatastructureUtility<Integer>(); 
			String s="";
			while((s=br.readLine())!=null)
			{
				StringTokenizer st=new StringTokenizer(s," ");
				while(st.hasMoreTokens())
				{
					int number=Integer.parseInt(st.nextToken());
					 list.addAndSort(number);	   
				}
			}
			br.close();
			fr.close();
			Boolean bool=true;
			System.out.print("\n1.Search number\t2.Sort numbers\t3.Display List\t4.Terminate\n\n");
			while(bool)
			{
				System.out.print("\nEnter your choice : ");
				int n=Integer.parseInt(b.readLine());
				switch(n)
				{
					case 1:
						System.out.print("Enter the number : ");
						int search=Integer.parseInt(b.readLine());		
					if(list.search(search)==true) {
						list.remove(search);
					}
						else if(list.search(search)==false){
						list.addAndSort(search);
					}
						break;	
					case 2:
						System.out.print("Enter the number : ");
						int data1=Integer.parseInt(b.readLine());
						System.out.print("Sorted List : ");
						list.addAndSort(data1);
						list.display();
						break;
					case 3:
						System.out.println("Data : ");
						list.display();
						break;
					case 4:
						System.out.println("\n-------    Data successfully saved     -------\n");
						bool=false;
						break;
					default:
						System.out.println("Wrong Input");
				}
			}
		}
		catch(Exception e){
			System.out.println(e);
			}
	}		
}
