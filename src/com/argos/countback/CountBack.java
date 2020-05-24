package com.argos.countback;

/**
 * Count back class runs the loop from 100 down to 1 and prints §some strings on the basis of some conditions.
 * 
 * @author r.ratnakar
 */
public class CountBack {

	/**
	 * Main method.
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*
		 * Below logic runs the loop from 100 down to 1  and does the following:
		 * 1. Prints "Agile" if loop counter is divisible by 5 and not 3
		 * 2. Prints "Software" if the loop counter is divisible by 3 and not 5
		 * 3. Prints "Testing" if the loop counter is divisibile by both 5 and 3
		 * 4. Prints the loop counter itself if none of the above conditions are met
		 */ 
		for(int i =100; i>=1 ; i--){
			if (i % 5 == 0 && i % 3 != 0){
				System.out.println("Agile");
			} else if (i % 3 == 0 && i % 5 != 0) {
				System.out.println("Software");
			} else if (i % 5 == 0 && i % 3 == 0) {
				System.out.println("Testing");
			} else {
				System.out.println(i);
			}
		}
	}
}
