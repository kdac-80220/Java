package com.shivshankar.assignment9;

public class FindMinimum {
	
	public static <T extends Number> T Minimum(T[] arr)
	{
		T min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(min.doubleValue()>arr[i].doubleValue())
				min=arr[i];
		}
		return min;
	}
	
	public static void main(String[] args) {
		Integer num[]= {7,22,5,8,6};
		Object obj[]= {1,1.2,"22"};
		
		int min=Minimum(num);
		System.out.println(num.toString());
		System.out.println("Minimum Number: "+min);
	}
}
