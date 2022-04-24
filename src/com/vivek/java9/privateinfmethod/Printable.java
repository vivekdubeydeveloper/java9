package com.vivek.java9.privateinfmethod;

public interface Printable {

	default void getAndPrintSpaceSeperatedData() {
		System.out.println(getData(" "));
	}

	default void getAndPrintCommaSeperatedData() {
		System.out.println(getData(","));
	}

	private StringBuffer getData(String seperator) {
		String[] lineA = { "1", "2", "3", "4", "5" };
		StringBuffer sb = new StringBuffer();
		for (String word : lineA) {
			sb.append(word).append(seperator);
		}

		return sb;
	}
	
	
	
	static void printSpaceSeperatedData() {
		System.out.println(readData(" "));
	}

	static void printCommaSeperatedData() {
		System.out.println(readData(","));
	}

	private static StringBuffer readData(String seperator) {
		String[] lineA = { "1", "2", "3", "4", "5" };
		StringBuffer sb = new StringBuffer();
		for (String word : lineA) {
			sb.append(word).append(seperator);
		}

		return sb;
	}

}
