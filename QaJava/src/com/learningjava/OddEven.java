package com.learningjava;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create a software program that will determine if a number is odd or even.

		try (Scanner input = new Scanner(System.in)) {
			{
				System.out.println("Enter a number");
				int c;

				c = input.nextInt();

				if ((c / 2) * 2 == c)
					System.out.println("The number is even");

				else
					System.out.println("The number is odd");
			}
		}

	}

}
