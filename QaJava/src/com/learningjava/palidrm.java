package com.learningjava;

import java.util.Scanner;

public class palidrm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original, reverse = "";
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string:");
		original = in.nextLine();
		int n= original.length();
		for (int i=n-1; i>=0; i--)
		{
			reverse = reverse + original.charAt(i);
		
		if (original.equalsIgnoreCase(reverse))
		{
			System.out.println("String is a palindrome");
		} 
		else
		{
			System.out.println("String is not a palindrome");
		}

	}
}
}