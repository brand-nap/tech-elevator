package com.techelevator;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindAndReplace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the source word?");
        String search = scanner.nextLine();
        System.out.println("What is the replacement word?");
        String replace = scanner.nextLine();
        System.out.println("What is the source file?");
        File source = new File(scanner.nextLine());
        System.out.println("What is the destination file?");
        File destination = new File(scanner.nextLine());
        try {
            destination.createNewFile();
        }catch(IOException e){}

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
        }catch(IOException e){
            System.out.println("Destination doesn't exist");
        }
    }
}
