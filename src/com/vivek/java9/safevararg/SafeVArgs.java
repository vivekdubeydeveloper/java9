package com.vivek.java9.safevararg;

import java.util.Arrays;
import java.util.List;

/**
 * @author vivek
 *
 */
public class SafeVArgs {

	public static void main(String[] args) {
		List<String> l1 = Arrays.asList("mum","lko");
		List<String> l2 = Arrays.asList("lon","nyc");
		
		
		SafeVArgs.myMethod(l1,l2);
		
		new SafeVArgs().myMethodJava9(l1,l2);
	}
	

	@SafeVarargs
	public static void myMethod(List<String>... l) {//List<String>[]
		
		//Heap pollution problem
		/*Object [] obj=l;
		obj[0]=Arrays.asList(1,2);*/
		
		System.out.println(l[0].get(0));
		
		
		
	} 
	
	@SafeVarargs
	private void myMethodJava9(List<String>... l) {
		System.out.println(l[0].get(0));
	}
}
