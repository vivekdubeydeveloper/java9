package com.vivek.java9.immutablecollection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class ImmutableCollection {

	public static void main(String[] args) {
		List<String> metrosL = List.of("Delhi", "Mumbai", "Kolkta", "Chennai");
		
		// this line will give error
		// metros.add("Noida");

		Set<String> metrosS = Set.of("Delhi", "Mumbai", "Kolkta", "Chennai");

		Map<Integer, String> metrosM = Map.of(1, "Delhi", 2, "Mumbai", 3, "Kolkta", 4, "Chennai");

		System.out.println(metrosM);
		
		
	}

}
