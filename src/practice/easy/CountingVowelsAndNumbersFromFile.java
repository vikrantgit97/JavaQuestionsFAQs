package practice.easy;

import java.util.Scanner;
import java.io.IOException;
import java.io.FileInputStream;

public class CountingVowelsAndNumbersFromFile {
    public static void main(String[] args) {
        int vowelCount = 0,numberCount=0;
        try {
            FileInputStream fileinputstream = new FileInputStream("src/com/test/easy/demo.txt");
            Scanner scanner = new Scanner(fileinputstream);
            while (scanner.hasNextLine()) {
                String store = scanner.nextLine();     // Storing each line of String into store variable
                for (int i = 0; i < store.length(); i++) {
                    // Running loop till characters exits in the string
                    char ch = store.charAt(i); // Storing each character of String as per Index i
                    if (ch == 65 || ch == 69 || ch == 73 || ch == 79 || ch == 85 || ch == 97 || ch == 101 || ch == 105|| ch == 111 || ch == 117) {
                        vowelCount++;        // Checking for vowels using ASCII values
                    }
                    if (ch >= 48 && ch <= 57) {     // to check if character in a string is number
                        numberCount++; 
                    }
                }
            }
            System.out.println("Total No. of Vowels in file are : " + vowelCount+ " & Total No. of Numbers in file are : " + numberCount);
            scanner.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
