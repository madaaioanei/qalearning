package com.learningjava;

public class SumOfMultiples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// sums all multiples of three and five
		// == Equal to x == y
		// % Modulus Returns the division remainder x % y
		//+=	x += 3	x = x + 3
		//|| 	Logical or	Returns true if one of the statements is true	x < 5 || x < 4	

		System.out.println("Sum all multiples of 3 and 5 is: " + getSum());
	}

	private static int getSum() {

		int sum = 0;
		for (int i = 1; i < 1000; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		return sum;
	}
}
