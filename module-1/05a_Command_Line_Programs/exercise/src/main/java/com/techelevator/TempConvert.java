package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {
		//Complete! :)

		Scanner sc = new Scanner(System.in);
		Scanner scTwo = new Scanner(System.in);

		System.out.println("Please enter the temperature: ");
		Double temp = sc.nextDouble();




		System.out.println("Is that in (C)elsius or (F)ahrenheit? ");

		String finalPhrase ="Please enter a valid input (F or C).";
		while (finalPhrase.equals("Please enter a valid input (F or C).")) {
			String type = scTwo.nextLine();
			finalPhrase = (type.equals("F")) ? "" + temp + "F is " + ((temp - 32) / 1.8) + "C" : (type.equals("C")) ? "" + temp + "C is " + (temp * 1.8 + 32) + "F" : "Please enter a valid input (F or C).";
			System.out.println(finalPhrase);
		}
	}

}
