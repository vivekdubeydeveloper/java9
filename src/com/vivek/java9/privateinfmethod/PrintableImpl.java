package com.vivek.java9.privateinfmethod;

public class PrintableImpl implements Printable {

	public static void main(String[] args) {

		Printable p = new PrintableImpl();

		p.getAndPrintSpaceSeperatedData();

		p.getAndPrintCommaSeperatedData();

	}

}
