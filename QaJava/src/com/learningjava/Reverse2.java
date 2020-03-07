package com.learningjava;

import java.util.Scanner;

public class Reverse2 {

	private static Object String;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter word");
		String word=myObj.nextLine();
	

		String reverse = new StringBuffer(word).reverse().toString();
		System.out.println(word + " for reading in reverse is " + reverse);
	}
	}


