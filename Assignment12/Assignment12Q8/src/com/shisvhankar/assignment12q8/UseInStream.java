package com.shisvhankar.assignment12q8;

import java.util.Random;
import java.util.stream.IntStream;


public class UseInStream {

	public static void main(String[] args) {
		Random r=new Random();
		//IntStream strm=IntStream.generate(()->r.nextInt(10)).limit(10);
		IntStream strm=IntStream.range(1, 10);
		int sum=strm.sum();
		System.out.println("Sum strm: "+sum);
		
		IntStream s1=IntStream.range(1,20);
		System.out.println(s1.summaryStatistics());
		
	}

}
