package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {
		//Complete! :)

		Scanner sc = new Scanner(System.in);
		Scanner scTwo = new Scanner(System.in);

		System.out.println("Please enter the distance: ");
		Double dist = sc.nextDouble();




		System.out.println("Is that in (m)eters or (f)eet? ");

		String finalPhrase ="Please enter a valid input (f or m).";
		while (finalPhrase.equals("Please enter a valid input (f or m).")) {
			String type = scTwo.nextLine();
			finalPhrase = (type.equals("f")) ? "" + dist + "f is " + (dist * 0.3048) + "m" : (type.equals("m")) ? "" + dist + "m is " + (dist * 3.2808399) + "f" : "Please enter a valid input (f or m).";
			System.out.println(finalPhrase);
		}
	}

}
