package com.shivshankar.assignment12q5;

interface Check<T>
{
	boolean compare(T x,T y);
}

public class GenericInterfeaceLambdaExpressionDouble {
	static <T>int countRepeatedValues(T []arr,T key,Check <T> c)
	{
		int count=0;
		for(T a:arr)
		{
			if(c.compare(a,key))   // actual implemntatil x.equals(y)
				count++;
		}
		return count;
	}
	public static void main(String[] args) {
		Double d[]= {1.2,3.3,4.6,3.3,4.5,3.3};
		double key=3.3;
		int result=countRepeatedValues(d,key,(x,y)->x.equals(y));
		System.out.println(result);
	}

}
