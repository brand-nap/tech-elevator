package com.techelevator;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindAndReplace {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String search = scanner.nextLine();
        String replace = scanner.nextLine();
        File source = new File(scanner.nextLine());
        File destination = new File(scanner.nextLine());
        destination.createNewFile();
        try(PrintWriter fileWriter = new PrintWriter(destination)){
            Scanner fileReader = new Scanner(source);
            while(fileReader.hasNextLine()){
                String[] line = fileReader.nextLine().split( " ");
                for(int i = 0; i < line.length-1; i++){
                    line[i] = (line[i].equals(search)) ? replace : (line[i].equals(search + ",")) ? replace + "," : line[i];
                    fileWriter.print(line[i] + " ");
                }
                fileWriter.println(line[line.length-1]);;
            }
        }
    }
}
