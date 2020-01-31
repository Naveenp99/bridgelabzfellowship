package com.blz.datastructure;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import com.blz.datastructure.utils.DatastructureUtility;

public class UnOrderedList<T> {

	public static void main(String[] args) {
		
		try{
			FileReader fr=new FileReader("/home/user/eclipse-workspacefinal/bridgelabz/src/main/java/com/bridgelabz/datastructure/base/string.txt");
			BufferedReader br=new BufferedReader(fr);
			BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
			DatastructureUtility<String> list=new DatastructureUtility<>();
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
						list.remove(search);
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
}
