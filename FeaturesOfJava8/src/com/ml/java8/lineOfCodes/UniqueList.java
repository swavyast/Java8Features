package com.ml.java8.lineOfCodes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueList {

	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("Aman","Sumit","Pulkit","Aman","Suman","Pulkit","Vinod","Pramod");
		list1.stream().forEach(System.out::print);
		List<String> list2 = new ArrayList<String>();
		List<String> list3 = null;
		//before java 8
		for(String s:list1) {
			if(!list2.contains(s)) {
				list2.add(s);
			}
		}System.out.println();
		list2.stream().forEach(System.out::println);
		
		//after java 8
		
		list3 = list1.stream().distinct().collect(Collectors.toList());
		System.out.println("Unique list of names using java8 : "+list3);
		
	}

}
