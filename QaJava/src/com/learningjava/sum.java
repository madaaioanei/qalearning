package com.learningjava;

import java.util.Scanner;

public class sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 try (Scanner input = new Scanner(System.in)) {
			{
				System.out.println(" Enter 2 variables : ");

				int firstVariable= input.nextInt();
				int secondVariable= input.nextInt();

				int sum= (firstVariable+secondVariable);
				System.out.println("Sum is =" + sum);
			}
		}
	}

}
