package com.techelevator;
import java.util.Scanner;
public class DecimalToBinary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please list some decimal numbers to convert to binary: ");
		String unconvertedLine = sc.nextLine();
		String[] strList = unconvertedLine.split(" ");
		System.out.println();
		for (String s : strList) {
			System.out.println(s + " in binary is " + binaryBarfer(Double.parseDouble(s)));
		} //IT'S ALL SO BEAUTIFUL *crying emoji*
	}
	public static String binaryBarfer(double og){
		String binaryReturn = "0";
		while(og!=0){
			int binaryPow;
			for(binaryPow = 0; Math.pow(2, binaryPow+1)<=og; binaryPow++ ){}
			og-=Math.pow(2, binaryPow);
			String newAddition = "1";
			for(; binaryPow!=0; binaryPow--){
				newAddition = newAddition+ "0";
			}
			binaryReturn = (binaryReturn.equals("0")) ? binaryReturn = newAddition : binaryReturn.substring(0, binaryReturn.length()-newAddition.length()) + newAddition;
		}
		return binaryReturn;
	}
}
