package com.shivshankar.assignment9;

import java.util.Arrays;
import java.util.Comparator;

public class selectionSort {
	static <T> void selectionSort(T[] arr, Comparator<T> c) {
		for(int i=0; i<arr.length-1; i++) {
		for(int j=i+1; j<arr.length; j++) {
			if(c.compare(arr[i], arr[j]) > 0) {
				T temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				}
			  }
		   }
		}
	
	 
	public static void main(String[] args) {
		
		
		Double d[]= {16.1,98.4,55.40,36.12,96.14};
		
		
		class SortComparator implements Comparator<Double>{
			@Override
			public int compare(Double d1,Double d2) {
				int diff=d1.compareTo(d2);
				return diff;
			}
		}
		
		
		
		SortComparator comparator=new SortComparator();
		selectionSort(d,comparator);
		for(Double dd:d)
		System.out.println(dd);
	}
}
