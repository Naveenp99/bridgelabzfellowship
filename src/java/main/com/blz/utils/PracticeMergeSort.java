package com.blz.utils;

public class PracticeMergeSort {

	public static void main(String[] args) {
		int[] array = {8,0,4,9,5,7,2,1,3,6};
		sort(array);
		for(int result : array)
			System.out.print(result+" ");
	}
	
	public static void sort(int[] array) {
		if(array.length == 1)
			return;
		int[] l = new int[array.length/2];
		int[] r = new int[array.length - l.length];
		
		int i;
		for ( i = 0; i < l.length; i++) {
			l[i] = array[i];
		}
		for (int j = 0; j < r.length; j++) {
			r[j] = array[i];
			i++;
		}
		sort(l);
		sort(r);
		merge(l, r, array);
	}
	
	public static void merge(int[] a, int[] b, int[] c) {
		int i=0;
		int j=0;
		int k=0;
		while (i < a.length && j < b.length) {
			if(a[i] < b[j]) 
				c[k++] = a[i++];
			else
				c[k++] = b[j++];
		}
		while(i < a.length) {
			c[k++] = a[i++];
		}
		while(j < b.length) {
			c[k++] = b[j++];
		}
	}
	
}
