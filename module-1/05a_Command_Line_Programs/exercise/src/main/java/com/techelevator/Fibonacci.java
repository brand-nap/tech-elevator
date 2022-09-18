package com.techelevator;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		//Complete! :)

		Scanner sc = new Scanner(System.in);

		System.out.print("How far would you like the Fibonacci sequence? ");
		int fibCap = sc.nextInt();

		int numOne = 0;
		int numTwo = 1;

		System.out.print(numOne);
		numOne+=numTwo;
		while(numOne <= fibCap && numTwo <=fibCap){
			System.out.print(", " + numTwo + ", " + numOne);
			numTwo+=numOne;
			numOne+=numTwo;
		}

		if(numTwo<=fibCap){
			System.out.println(", " + numTwo);
		}
	}

}
