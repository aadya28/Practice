//Program to read text from a file and create methods to access individual words and lines.

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class ReadFile{
    public static void getWords() throws IOException{
        List<String> strgfile = new ArrayList<String>();
        try (Scanner scan = new Scanner(new FileReader("/Users/aadya/HackerRank/common.txt"))) {
            while(scan.hasNext()){
            String word = scan.next();
            strgfile.add(word);
            }
        }
        String[] common = strgfile.toArray(new String[0]);
        for (String eachString : common){
            System.out.println(eachString);
        }
	}

    public static void getLines() throws IOException{
        try (Scanner scan = new Scanner(new FileReader("/Users/aadya/HackerRank/common.txt"))) {
            while(scan.hasNextLine()){
            String Line = scan.nextLine();
            System.out.println(Line);
            }
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        try {
            getWords();
            getLines();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
