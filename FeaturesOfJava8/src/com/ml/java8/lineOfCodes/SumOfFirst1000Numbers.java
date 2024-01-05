package com.ml.java8.lineOfCodes;

import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

public class SumOfFirst1000Numbers {

	public static void main(String[] args) {
		int sum = 0;
		for(int i = 0; i<=1000;i++) {
			sum+=i;
		}
		System.out.println("Sum in java before java8 : "+sum);
		int total = IntStream.rangeClosed(0, 1000).map(IntUnaryOperator.identity()).sum();
		//OR
		@SuppressWarnings("removal")
		int total1 = IntStream.rangeClosed(0, 1000).map(Integer::new).sum();
		System.out.println("Sum in java after java8 : "+total);
		System.out.println("Sum in java after java8 : "+total1);
	}
	
}
