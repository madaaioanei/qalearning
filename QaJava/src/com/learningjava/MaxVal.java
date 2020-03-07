package com.learningjava;

import java.util.ArrayList;

public class MaxVal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub ArrayList numbers=new ArrayList();
		ArrayList<Integer> list = new ArrayList<Integer>(); 
        list.add(5); 
        list.add(3); 
        list.add(12); 
        list.add(48);
        Integer maxNumber= findMaxNumberFromArrayList(list);
        System.out.println("Max number = " + maxNumber);
        
	}
 
	
	private static Integer findMaxNumberFromArrayList(ArrayList<Integer> list) {
		// TODO Auto-generated method stub
		Integer max= Integer.MIN_VALUE;
		for (Integer number : list) {
			if(number> max) {
				max=number;
			}
		}
		return max;
	}
}
`