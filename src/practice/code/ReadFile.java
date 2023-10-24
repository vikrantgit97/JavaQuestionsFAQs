package practice.code;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) throws IOException {
	// Approach 1: using fileReader BufferReader

		/*FileReader fr = new FileReader("D:\\demo.txt");
		BufferedReader br = new BufferedReader(fr);
		String str;

		while ((str = br.readLine()) != null) {
			System.out.println(str);
		}
		fr.close();
		br.close();*/
		
		
	// Approach 2: using scanner and file
		
		File file=new File("D:\\demo.txt");//read from desktop location C:\\Users\\HP\\Desktop\\Note.txt
		Scanner sc=new Scanner(file);
		
		//loop statement
		/*while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}*/
	
		
	// Approach 2: using scanner and file
		sc.useDelimiter("\\Z");
		System.out.println(sc.next());
		sc.close();
	}
}
