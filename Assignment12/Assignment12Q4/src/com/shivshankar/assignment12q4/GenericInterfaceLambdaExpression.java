package com.shivshankar.assignment12q4;

@FunctionalInterface
interface Check<T>
{
	boolean compare(T x,T y);
}


public class GenericInterfaceLambdaExpression {
	static <T> int countIf(T[] arr, T key, Check<T> c)
	{
		int count=0;
		for(T ele:arr)
		{
			if(c.compare(ele, key))
				count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		Integer arr[]= {11,88,66,45,74,35,55};
		int key=55;
		int result=countIf(arr,key,(x,y)->x>y);
		System.out.println("Greter than key "+key+" numbers in array are "+result);
	}
}
