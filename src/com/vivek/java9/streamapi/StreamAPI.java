package com.vivek.java9.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {

	public static void main(String[] args) {
		
		List<Integer> asList = Arrays.asList(5,10,15,20,12,34,56,60,null);
		
		//filter the elements which are multiple of 5
		
		List<Integer> collect = asList.stream().filter(x->x!=null && x%5==0).collect(Collectors.toList());
		
		System.out.println(collect);
		
		//take while method consider the elements till where predicate return true when return first false not consider elements from there
		
		List<Integer> collect1 = asList.stream().takeWhile(x->x%5==0).collect(Collectors.toList());
		
		System.out.println(collect1);
		
		//drop while method consider the elements from where predicate return first false consider all elements including this also
		
        List<Integer> collect2 = asList.stream().dropWhile(x->x%5==0).collect(Collectors.toList());
		
		System.out.println(collect2);
		
		//Of nullable use to ignore null elements
		
		List<Integer> collect3 =asList.stream().flatMap(x->Stream.ofNullable(x)).collect(Collectors.toList());
		
		System.out.println(collect3);
		
		
	}

}
