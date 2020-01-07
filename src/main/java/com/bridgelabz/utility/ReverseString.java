package com.bridgelabz.utility;

public class ReverseString<T> {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub

	}*/
	public T reverse(T s) {
		String reverse="";
		 for(int i=((String) s).length()-1;i>=0;i--)
		 {
			 reverse+=((String) s).charAt(i);
		 }
		 return (T) reverse;
	}
	
}
