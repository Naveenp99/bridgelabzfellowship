package com.bridgelabz.datastructure.base;
import java.util.*;
public class SplitPrimeNumAndStoreInTwoDArray {
   public static void main(String[] args) {
	   Scanner scn=new Scanner(System.in);
	   System.out.println("Enter the number of c: ");
	   int c=scn.nextInt();
	   System.out.println("Enter the number of d: ");
	   int d=scn.nextInt();
	   while(c<=900 && d<=1000) {
		   System.out.print("arr["+c+"]"+"["+d+"]"+" is:");
		 primerange(c,d);
	   System.out.println();
	   c=d;;
	   d+=100;
   }
   }
   public static void primerange(int a,int b) {
	   int[][] arr=new int[a+1][b+1]; 
		for(int i=a;i<=b;i++) {
			if(i==0||i==1) continue;
			int flag=0;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					flag=1;
					break;
				}
			}
			if(flag==0) {
				arr[a][b]=i;
				System.out.print(arr[a][b]+" ");
			}
		}
}
}
