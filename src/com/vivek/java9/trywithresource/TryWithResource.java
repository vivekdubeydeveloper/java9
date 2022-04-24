package com.vivek.java9.trywithresource;

import java.io.ByteArrayInputStream;

/**
 * @author vivek
 *
 */
public class TryWithResource {

	public static void main(String[] args) {

		ByteArrayInputStream bais = new ByteArrayInputStream("This is cat".getBytes());

		try (bais) {

			byte[] b = bais.readAllBytes();

			for (byte c : b) {
				System.out.println((char) c);
			}

		} catch (Exception e) {
			System.out.println("Exception Occured");
		}
	}

}
