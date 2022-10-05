package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class WordSearch {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(System.in);

		System.out.println("What is the fully qualified name of the file that should be searched?");
		File searchedFile = new File(scanner.nextLine());

		Scanner fileScanner = new Scanner(searchedFile);


		System.out.println("What is the search word you are looking for?");
		String keyword = scanner.nextLine();

		System.out.println("Should the search be case sensitive? (Y\\N)");
		boolean caseSensitive = scanner.nextLine().equals("Y");


		int lineNum = 1;
		while(fileScanner.hasNextLine()){
			String line = fileScanner.nextLine();
			String[] words = line.split(" ");
			boolean hasKey = false;
			for(String i : words) {
				hasKey = (i.equals(keyword) || (!caseSensitive&&i.equalsIgnoreCase(keyword))) ? true : hasKey;
			}
			if(hasKey) {
				System.out.println(lineNum + ") " + line);
			}
			lineNum++;
		}
	}


}
