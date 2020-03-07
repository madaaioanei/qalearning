package com.learningjava;

public class Reverse {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		// Write a method that reverses a string.
		// For example, 'java interview' becomes 'weivretni avaj'
		String word = "Java interview";
		String reverse = new StringBuffer(word).reverse().toString();
		System.out.println(word + " for reading in reverse is " + reverse);

	}

}
