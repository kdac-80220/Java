package com.shivshankar.assignment12q6;

import java.util.Scanner;
import java.util.stream.Stream;

public class UseOfReduce {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter number");
		num=sc.nextInt();
		Stream<Integer>strm=Stream.iterate(1, x->x+1)
							.limit(num);
		
		Integer result=strm.reduce(1,(x,y)-> x*y);
		System.out.println(result);
		
	}

}
