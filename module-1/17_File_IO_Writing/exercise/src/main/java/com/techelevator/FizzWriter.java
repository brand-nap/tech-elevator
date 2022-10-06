package com.techelevator;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FizzWriter {
	public static void main(String[] args) throws IOException {
		try(PrintWriter fileWriter = new PrintWriter(new File(new Scanner(System.in).nextLine()))){
			for (int i = 1; i < 301; i++) {
				String str = (i%5 == 0 && i%3 == 0) ? "FizzBuzz": (i%5 == 0) ? "Buzz": (i%3 == 0) ? "Fizz": ""+i;
				fileWriter.println(str);
			}
		}
	}
}
