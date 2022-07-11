package Codes;

import java.util.Scanner;

public class G_Letter_By_Letter {
public static void main(String[] args) {
	
	Scanner reader = new Scanner(System.in);

	System.out.println("Type a wo");
	String word = reader.nextLine();
	reader.close();
	
	char chars[] = word.toCharArray();

	for (int i = 0; i < chars.length; i++) {
		System.out.println(chars[i]);
	}
	
 }
}
