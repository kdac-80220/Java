package com.shivshankar.assignment12q7;

import java.util.Random;
import java.util.stream.Stream;

public class PrintSumTenIntegerNumbers {

	public static void main(String[] args) {
		Random r=new Random();
		
		Stream <Integer> strm=Stream.generate(()->r.nextInt(10))
								.limit(10);
		
		Integer i=strm.reduce(0, (x,y)->x+y);		
		System.out.println(i);
	}

}
